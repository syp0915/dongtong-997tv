package com.shfc.nnstv.service.impl;

import com.alibaba.fastjson.JSON;
import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.domain.BaseTag;
import com.shfc.nnstv.domain.RealtorInfo;
import com.shfc.nnstv.dto.TVBoxDTO;
import com.shfc.nnstv.dto.httpbean.resp.HouseInfoBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorDetailRespBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorInfoBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorListRespBean;
import com.shfc.nnstv.manager.HouseManager;
import com.shfc.nnstv.manager.RealtorInfoManage;
import com.shfc.nnstv.service.RealtorInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.service.impl
 * @Description :TODO
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 10:04
 * version V1.0.0
 **/
@Service
public class RealtorInfoServiceImpl extends BaseServiceImpl implements RealtorInfoService{

    @Autowired(required = false)
    private RealtorInfoManage realtorInfoManage;

    @Autowired(required = false)
    private HouseManager houseManager;

    private static Logger logger = Logger.getLogger(RealtorInfoServiceImpl.class);

    private static int showNumber=6;   //展示主营小区数



    /**
     * 经纪人列表
     * @param mac
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public ResultDO<RealtorListRespBean> getRealtorList(String mac,Integer pageSize, Integer pageNumber){
        ResultDO<RealtorListRespBean> resultDO=new ResultDO<>();
        RealtorListRespBean realtorListRespBean=new RealtorListRespBean();
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
            realtorListRespBean.setCurrentAddress(address);
        }
        Page<RealtorInfo> page =realtorInfoManage.getRealtorInfoListByCondition(pageSize, pageNumber);
        List<RealtorInfo> list =page.getData();
        if (list != null && list.size() > 0){
            List<RealtorInfoBean> realtorInfoBeanList=new ArrayList<RealtorInfoBean>();
            for (RealtorInfo realtorInfo : list) {
                RealtorInfoBean realtorInfoBean=new RealtorInfoBean();
                if(realtorInfo!=null){
                    realtorInfoBean.setRealId(realtorInfo.getId());
                    realtorInfoBean.setHeadPortrait(realtorInfo.getHeadPortrait());
                    realtorInfoBean.setEntrustHouseNumber(realtorInfo.getEntrustHouseNumber());
                    realtorInfoBean.setRealCompanyName(realtorInfo.getComName());
                    realtorInfoBean.setRealName(realtorInfo.getRealName());
                    realtorInfoBean.setTelephone(realtorInfo.getTelphone());
                    realtorInfoBean.setRealStoreName(realtorInfo.getStoreName());
                }
                realtorInfoBeanList.add(realtorInfoBean);
            }
            realtorListRespBean.setRealtorInfoBeanList(realtorInfoBeanList);
            realtorListRespBean.setPageSize(page.getPageSize());
            realtorListRespBean.setPageNumber(page.getPageNumber());
            realtorListRespBean.setTotalCount(page.getTotalSize());
        }
        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(realtorListRespBean);
        return resultDO;
    }

    /**
     * 委托房源量前三经纪人信息
     * @return
     */
    public ResultDO<RealtorListRespBean> getRealtorListByHomePage(){
        ResultDO<RealtorListRespBean> resultDO=new ResultDO<>();
        RealtorListRespBean realtorListRespBean=new RealtorListRespBean();
        List<RealtorInfo> realtorInfoList=realtorInfoManage.getRealtorInfoList();
        List<RealtorInfoBean> realtorInfoBeanList=new ArrayList<RealtorInfoBean>();
        if (realtorInfoList.size()>0){
            for (RealtorInfo realtorInfo : realtorInfoList) {
                RealtorInfoBean realtorInfoBean=new RealtorInfoBean();
                if(realtorInfo!=null){
                    realtorInfoBean.setRealId(realtorInfo.getId());
                    realtorInfoBean.setHeadPortrait(realtorInfo.getHeadPortrait());
                    realtorInfoBean.setEntrustHouseNumber(realtorInfo.getEntrustHouseNumber());
                    realtorInfoBean.setRealCompanyName(realtorInfo.getComName());
                    realtorInfoBean.setRealName(realtorInfo.getRealName());
                    realtorInfoBean.setTelephone(realtorInfo.getTelphone());
                    realtorInfoBean.setRealStoreName(realtorInfo.getStoreName());
                }
                realtorInfoBeanList.add(realtorInfoBean);
            }
            realtorListRespBean.setRealtorInfoBeanList(realtorInfoBeanList);
        }
        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(realtorListRespBean);
        return  resultDO;

    }

    /**
     * 查询经纪人详情
     * @param id
     * @return
     */
    public ResultDO<RealtorDetailRespBean> selectDetailById(Long id,String mac){
        ResultDO<RealtorDetailRespBean> resultDO=new ResultDO<>();
        ResultDO<Object> re=selectDetailById(id);
        if(re.isSuccess()==false){
            resultDO.setSuccess(false);
            resultDO.setErrMsg(re.getErrMsg());
            return resultDO;
        }
        RealtorDetailRespBean realtorDetailRespBean=new RealtorDetailRespBean();
        HashMap<String,Object> hashMap=(HashMap<String,Object>)re.getData();
        RealtorInfoBean realtorInfoBean=new RealtorInfoBean();
        ResultDO<TVBoxDTO> tvInfo = houseManager.getTVBoxInfoByCondition(mac);
        logger.info("[remote]tvbox info is--------------------->" + JSON.toJSON(tvInfo));
        Double longitude =0.00;
        Double latitude=0.00;
        if(tvInfo!=null && tvInfo.getData()!=null){
            longitude = tvInfo.getData().getLon();
            latitude = tvInfo.getData().getLat();
        }
        if(hashMap.size()>0){
            realtorInfoBean=(RealtorInfoBean) hashMap.get("realtorInfoBean");
            Long realtorId=realtorInfoBean.getRealId();
            //RealtorStore realtorStore=(RealtorStore)hashMap.get("realtorStore");
                //根据经纪人所在门店地址筛选出最近的两套房源
                Page<HashMap<String, Object>> page = houseManager.getHouseListByRealtorId(latitude, longitude,realtorId, 2, 1);
                List<HashMap<String, Object>> list = page.getData();
                if (list != null && list.size() > 0) {
                    List<HouseInfoBean> houseList = new ArrayList<HouseInfoBean>();
                    for (HashMap<String, Object> map : list) {
                        HouseInfoBean houseInfoBean = new HouseInfoBean();
                        houseInfoBean.setPlotName(checkStringMapObject(map.get("plot_name")));
                        houseInfoBean.setRoomCount(Integer.parseInt(checkIntMapObject(map.get("room"))));
                        houseInfoBean.setHallCount(Integer.parseInt(checkIntMapObject(map.get("hall"))));
                        houseInfoBean.setBathRoomCount(Integer.parseInt(checkIntMapObject(map.get("bathroom"))));
                        houseInfoBean.setKitchCount(Integer.parseInt(checkIntMapObject(map.get("kitchen"))));
                        houseInfoBean.setArea(Double.parseDouble(checkDecimalMapObject(map.get("area"))));
                        houseInfoBean.setFloorCount(Integer.parseInt(checkIntMapObject(map.get("floor"))));
                        houseInfoBean.setTotalFloorCount(Integer.parseInt(checkIntMapObject(map.get("total_floor"))));
                        houseInfoBean.setDistrictName(checkStringMapObject(map.get("district_name")));
                        houseInfoBean.setBlockName(checkStringMapObject(map.get("block_name")));
                        houseInfoBean.setAddress(checkStringMapObject(map.get("address")));
                        houseInfoBean.setTotalPrice(Double.parseDouble(checkDecimalMapObject(map.get("total_price"))));
                        houseInfoBean.setAdvisorName(checkStringMapObject(map.get("realtor_name")));
                        houseInfoBean.setAdvisorPhone(checkStringMapObject(map.get("realtor_phone")));
                        List<BaseTag> tagList = houseManager.getTagNameListByHouseId(Long.parseLong(checkIntMapObject(map.get("id"))));
                        houseList.add(houseInfoBean);
                    }
                    realtorDetailRespBean.setHouseList(houseList);

            }

            realtorDetailRespBean.setRealtorInfoBean(realtorInfoBean);
            boolean isAuth=(boolean)hashMap.get("isAuth");
            if(isAuth==false){
                resultDO.setSuccess(false);
                resultDO.setErrMsg("请求参数错误");
            }
        }
        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(realtorDetailRespBean);
        return  resultDO;
    }


    /**
     * 查询经纪人详情
     * @param id
     * @return
     */
    public ResultDO<Object> selectDetailById(Long id){
        ResultDO<Object> resultDO=new ResultDO<>();
        HashMap<String,Object> map=new HashMap<>();
        RealtorInfoBean realtorInfoBean=new RealtorInfoBean();
        RealtorInfo realtorInfo= realtorInfoManage.selectDetailById(id);
        if(realtorInfo!=null){
            String plotName="";
            String buildingNameList=realtorInfo.getBuildingNameList();
            String[] str= buildingNameList.split(",|、");
            if(str.length<=showNumber){
                plotName=buildingNameList.replace(",","、");
            }else{
                for(int i=0;i<showNumber;i++){
                    if(i<showNumber-1){
                        if(!ValidateHelper.isEmptyString(str[i])) {
                            plotName +=str[i]+ "、";
                        }
                    }else{
                        if(!ValidateHelper.isEmptyString(str[i])) {
                            plotName += str[i];
                        }
                    }
                }
            }
            realtorInfoBean.setRealId(realtorInfo.getRealtorId());
            realtorInfoBean.setRealStoreName(realtorInfo.getStoreName());
            realtorInfoBean.setTelephone(realtorInfo.getTelphone());
            realtorInfoBean.setRealName(realtorInfo.getRealName());
            realtorInfoBean.setRealCompanyName(realtorInfo.getComName());
            realtorInfoBean.setEntrustHouseNumber(realtorInfo.getEntrustHouseNumber());
            realtorInfoBean.setHeadPortrait(realtorInfo.getHeadPortrait());
            realtorInfoBean.setRealtorNumber(realtorInfo.getRealtorNumber());
            realtorInfoBean.setMainPlot(plotName);
            map.put("realtorInfoBean",realtorInfoBean);
            // map.put("realtorStore",realtorStore);
            map.put("isAuth",realtorInfo.getIsAuth());
            resultDO.setData(map);
        }else{
            resultDO.setErrMsg("该经纪人不存在");
            return resultDO;
        }
        resultDO.setSuccess(true);
        return resultDO;
    }

}
