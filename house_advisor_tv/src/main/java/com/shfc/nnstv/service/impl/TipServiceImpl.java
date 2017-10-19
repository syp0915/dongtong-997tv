package com.shfc.nnstv.service.impl;

import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.resp.TipInfoBean;
import com.shfc.nnstv.dto.httpbean.resp.TipInfoListRespBean;
import com.shfc.nnstv.manager.TipManager;
import com.shfc.nnstv.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 16:15
 **/
@Service
public class TipServiceImpl extends BaseServiceImpl implements TipService{

    @Autowired
    private TipManager tipManager;

    /**
     * 根据条件查询小贴士
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public ResultDO<TipInfoListRespBean> queryTips(Integer pageNumber, Integer pageSize) {
        ResultDO<TipInfoListRespBean> resultDO=new ResultDO<TipInfoListRespBean>();
        TipInfoListRespBean tipInfoListRespBean=new TipInfoListRespBean();

        if(pageNumber==null){
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        if(pageSize==null){
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }

        Page<HashMap<String,Object>> page=tipManager.queryTip(pageNumber,pageSize);
        List<HashMap<String,Object>> list=page.getData();
        List<TipInfoBean> arrayList =new ArrayList<TipInfoBean>();
        for(HashMap<String,Object> map:list){
            TipInfoBean tipInfoBean=new TipInfoBean();
            String no=checkIntMapObject((map.get("i")));
            int index=no.indexOf(".");
            tipInfoBean.setNo(Integer.parseInt(no.substring(0,index)));
            tipInfoBean.setQuestion(checkIntMapObject(map.get("question")));
            tipInfoBean.setAnswer(checkIntMapObject(map.get("answer")));
            arrayList.add(tipInfoBean);
        }
        tipInfoListRespBean.setList(arrayList);
        tipInfoListRespBean.setTotalCount(page.getTotalSize());
        tipInfoListRespBean.setPageNumber(page.getPageNumber());
        tipInfoListRespBean.setPageSize(page.getPageSize());
        tipInfoListRespBean.setTotalPage(page.getTotalPage());
        resultDO.setData(tipInfoListRespBean);
        resultDO.setSuccess(true);

        return resultDO;
    }
}
