package com.shfc.nnstv.ao;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.dto.httpbean.req.TipsListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.TipInfoListRespBean;
import com.shfc.nnstv.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 10:38
 **/
@Service
public class TipAO {

    @Autowired
    private TipService tipService;

    public ResultDO<TipInfoListRespBean> tipList(TipsListReqBean tipsListReqBean){
        return tipService.queryTips(tipsListReqBean.getPageNumber(),tipsListReqBean.getPageSize());
    }
}
