package com.shfc.nnstv.ao;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.req.RealtorDetailReqBean;
import com.shfc.nnstv.dto.httpbean.req.RealtorListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorDetailRespBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorListRespBean;
import com.shfc.nnstv.service.RealtorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.ao
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 17:14
 * version V1.0.0
 **/
@Service
public class RealtorInfoAO {
    @Autowired
    private RealtorInfoService realtorInfoService;

    public ResultDO<RealtorListRespBean> getRealtorList(RealtorListReqBean realtorListReqBean){
        ResultDO<RealtorListRespBean> resultDO = new ResultDO<RealtorListRespBean>();
        String mac = realtorListReqBean.getMac();
        Integer pageSize = realtorListReqBean.getPageSize();
        Integer pageNumber = realtorListReqBean.getPageNumber();
        Integer displayPosition = realtorListReqBean.getDisplayPosition();
        if (ValidateHelper.isEmpty(displayPosition)){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }else{
            if(displayPosition==0){
                resultDO= realtorInfoService.getRealtorListByHomePage();
            }
            if(displayPosition==1){
                if(ValidateHelper.isEmpty(mac)){
                    resultDO.setSuccess(false);
                    resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
                    resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
                    return resultDO;
                }
                resultDO= realtorInfoService.getRealtorList(mac,pageSize,pageNumber);
            }
        }

        return  resultDO;
    }

    public ResultDO<RealtorDetailRespBean> getRealtorDetail(RealtorDetailReqBean realtorDetailReqBean){
        ResultDO<RealtorDetailRespBean> resultDO = new ResultDO<RealtorDetailRespBean>();
        String realtorId = realtorDetailReqBean.getRealtorId();
        String mac = realtorDetailReqBean.getMac();
        if(ValidateHelper.isEmpty(realtorId) || ValidateHelper.isEmpty(mac)){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        resultDO= realtorInfoService.selectDetailById(Long.parseLong(realtorId),mac);
        return  resultDO;
    }

}
