package com.shfc.nnstv.service.impl;

import com.alibaba.fastjson.JSON;
import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.domain.RealtorCompany;
import com.shfc.nnstv.domain.RealtorStore;
import com.shfc.nnstv.dto.RealtorStoreDTO;
import com.shfc.nnstv.dto.TVBoxDTO;
import com.shfc.nnstv.dto.httpbean.resp.MechanismBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismCountRespBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismListRespBean;
import com.shfc.nnstv.manager.HouseManager;
import com.shfc.nnstv.manager.MechanismManager;
import com.shfc.nnstv.service.MechanismService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.service.impl
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 15:21
 * version V1.0.0
 **/
@Service
public class MechanismServiceImpl extends BaseServiceImpl implements MechanismService{

    @Autowired(required = false)
    private MechanismManager mechanismManager;

    @Autowired(required = false)
    private HouseManager houseManager;

    private static int showNumber=3;   //展示主营小区数

    private static Logger logger = Logger.getLogger(MechanismServiceImpl.class);


    /**
     * 认证机构列表查询（按照机顶盒位置排序）
     * @param mac
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public ResultDO<MechanismListRespBean> getMechanismList(String mac,Integer pageSize, Integer pageNumber){
        ResultDO<MechanismListRespBean> resultDO = new ResultDO<MechanismListRespBean>();
        MechanismListRespBean mechanismListRespBean=new MechanismListRespBean();
        ResultDO<TVBoxDTO> tvInfo = houseManager.getTVBoxInfoByCondition(mac);
        logger.info("[remote]tvbox info is--------------------->" + JSON.toJSON(tvInfo));
        Double longitude =0.00;
        Double latitude=0.00;
        if(tvInfo!=null && tvInfo.getData()!=null){
            longitude = tvInfo.getData().getLon();
            latitude = tvInfo.getData().getLat();
        }
        Page<RealtorStoreDTO> page =mechanismManager.getMechanismListByCondition(latitude, longitude, pageSize, pageNumber);
        List<RealtorStoreDTO> list =page.getData();
        if (list != null && list.size() > 0){
            List<MechanismBean> mechanismList=new ArrayList<MechanismBean>();
            for (RealtorStoreDTO realtorStore : list) {
                MechanismBean mechanismBean=new MechanismBean();
                if(realtorStore!=null){
                    String plotName=getMainPlotName(realtorStore.getId());
                    mechanismBean.setMainPlot(plotName);
                    mechanismBean.setCompanyName(realtorStore.getRealtorCompanyName());
                    mechanismBean.setCompanyImg(realtorStore.getRealtorCompanyImg());
                    mechanismBean.setStoreName(realtorStore.getStoreName());
                }
                mechanismList.add(mechanismBean);
            }
            mechanismListRespBean.setMechanismList(mechanismList);
            mechanismListRespBean.setPageSize(page.getPageSize());
            mechanismListRespBean.setPageNumber(page.getPageNumber());
            mechanismListRespBean.setTotalCount(page.getTotalSize());
        }
        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(mechanismListRespBean);
        return resultDO;
    }

    /**
     * 认证机构统计
     * @param mac
     * @return
     */
    public ResultDO<MechanismCountRespBean> getMechanismCount(String mac){
        ResultDO<MechanismCountRespBean> resultDO=new ResultDO<>();
        HashMap<String,Integer> hashMap=mechanismManager.getTotal();
        MechanismCountRespBean mechanismCountRespBean=new MechanismCountRespBean();
        if (hashMap.size()>0){
            mechanismCountRespBean.setCompanyTotal(hashMap.get("companyTotal"));
            mechanismCountRespBean.setRealtorStoreTotal(hashMap.get("realtorStoreTotal"));
        }
        ResultDO<TVBoxDTO> tvInfo = houseManager.getTVBoxInfoByCondition(mac);
        logger.info("[remote]tvbox info is--------------------->" + JSON.toJSON(tvInfo));
        if(tvInfo.getData()!=null){
            StringBuffer sbf=new StringBuffer();
            if(!ValidateHelper.isEmptyString(tvInfo.getData().getDistrict())){
                sbf.append(tvInfo.getData().getDistrict());
                if(!ValidateHelper.isEmptyString(tvInfo.getData().getResidenceName())){
                    sbf.append("-"+tvInfo.getData().getResidenceName());
                }
            }
            String address=sbf.toString();
            mechanismCountRespBean.setCurrentAddress(address);
        }
        mechanismCountRespBean.setServerTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(mechanismCountRespBean);
        return  resultDO;
    }

    /**
     * 获取门店的主营小区
     * @param storeId
     * @return
     */
    public  String getMainPlotName(Long storeId){
        List<String> plotList=mechanismManager.getPlotName(storeId);
        String plotName="";
        int count=0;
        if(!plotList.isEmpty() &&plotList.size()>0){
            for(int i=0;i<plotList.size();i++){
                if(!ValidateHelper.isEmptyString(plotList.get(i))) {
                    //最多显示3个小区
                    if (count < showNumber){
                        if(count<showNumber-1){
                            plotName += plotList.get(i) + " ";
                        }else{
                            plotName += plotList.get(i);
                        }
                        count++;
                    }else{
                        break;
                    }
                }
            }
        }else{   //如果在关系表中不存在，就取经纪门店下所有经纪人的主营小区去重
            List<String> list=mechanismManager.queryPlotName(storeId);
            StringBuffer sbf=new StringBuffer();
            if(!list.isEmpty() &&list.size()>0) {
                for (int i = 0; i < list.size(); i++) {
                    sbf.append(list.get(i)+",");
                }
                String[] array= sbf.toString().split(",|、");
                Set<String> set = new HashSet<>();
                for(int i=0;i<array.length;i++){
                    if(!ValidateHelper.isEmptyString(array[i])) {
                        if (count < showNumber) {
                            set.add(array[i]);
                            count++;
                        } else {
                            break;
                        }
                    }
                }
                String[] arrayResult = (String[]) set.toArray(new String[set.size()]);
                plotName=Arrays.toString(arrayResult);
                int len = plotName.length();
                plotName = plotName.substring(1, len-1);
                if (!ValidateHelper.isEmptyString(plotName)){
                    plotName=plotName.replace(","," ");
                }
            }
        }
        return plotName;
    }
}
