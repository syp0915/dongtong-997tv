package com.shfc.nnstv.ao;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.req.HouseListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.HouseListRespBean;
import com.shfc.nnstv.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/21 下午1:41.
 */
@Service
public class HouseAO {

    @Autowired(required = false)
    private HouseService houseService;

    public ResultDO<HouseListRespBean> getHouseList(HouseListReqBean houseListReqBean){
        ResultDO<HouseListRespBean> resultDO = new ResultDO<HouseListRespBean>();
        String mac = houseListReqBean.getMac();
        Integer pageSize = houseListReqBean.getPageSize();
        Integer pageNumber = houseListReqBean.getPageNumber();
        if (ValidateHelper.isEmpty(mac)){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        return houseService.getHouseList(mac, pageSize, pageNumber);
    }

}
