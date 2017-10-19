package com.shfc.nnstv.ao;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.req.MechanismListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismCountRespBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismListRespBean;
import com.shfc.nnstv.service.MechanismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.ao
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 16:02
 * version V1.0.0
 **/
@Service
public class MechanismAO {

    @Autowired
    private MechanismService mechanismService;

    public ResultDO<MechanismListRespBean> getMechanismList(MechanismListReqBean mechanismListReqBean){
        ResultDO<MechanismListRespBean> resultDO = new ResultDO<MechanismListRespBean>();
        String mac = mechanismListReqBean.getMac();
        Integer pageSize = mechanismListReqBean.getPageSize();
        Integer pageNumber = mechanismListReqBean.getPageNumber();
        if(ValidateHelper.isEmpty(mac) ){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        return mechanismService.getMechanismList(mac,pageSize, pageNumber);
    }

    public ResultDO<MechanismCountRespBean> getMechanismCount(MechanismListReqBean mechanismListReqBean){
        ResultDO<MechanismCountRespBean> resultDO = new ResultDO<MechanismCountRespBean>();
        String mac = mechanismListReqBean.getMac();
        if(ValidateHelper.isEmpty(mac) ){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        return mechanismService.getMechanismCount(mac);

    }


}
