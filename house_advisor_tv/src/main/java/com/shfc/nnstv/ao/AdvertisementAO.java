package com.shfc.nnstv.ao;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.req.AdvListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;
import com.shfc.nnstv.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 10:52
 **/
@Service
public class AdvertisementAO{

    @Autowired(required = false)
    private AdvertisementService advertisementService;

    public ResultDO<List<AdvertisementInfoBean>> getAdvList(AdvListReqBean advListReqBean){

        if(ValidateHelper.isEmpty(advListReqBean.getPage())){
            ResultDO<List<AdvertisementInfoBean>> resultDO=new ResultDO<>();
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }

        return advertisementService.getAdvList(advListReqBean.getPage());
    }
}
