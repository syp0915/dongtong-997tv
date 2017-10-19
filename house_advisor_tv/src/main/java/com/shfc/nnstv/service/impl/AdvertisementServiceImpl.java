package com.shfc.nnstv.service.impl;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;
import com.shfc.nnstv.manager.AdvertisementManager;
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
 * @create 2017-04-24 09:33
 **/
@Service
public class AdvertisementServiceImpl extends BaseServiceImpl implements AdvertisementService {
    @Autowired
    private AdvertisementManager advertisementManager;

    /**
     * 根据页面表示获取广告信息
     * @param page
     * @return
     */
    @Override
    public ResultDO<List<AdvertisementInfoBean>> getAdvList(String page) {
        ResultDO<List<AdvertisementInfoBean>> resultDO=new ResultDO<List<AdvertisementInfoBean>>();
        if(ValidateHelper.isEmpty(page)){
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }

        List<AdvertisementInfoBean> list=advertisementManager.queryAdv(page);
        resultDO.setData(list);
        resultDO.setSuccess(true);
        return resultDO;
    }
}