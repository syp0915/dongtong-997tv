package com.shfc.nnstv.service;

import com.alibaba.fastjson.JSON;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.resp.TipInfoListRespBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 16:23
 **/
public class TipserviceTest extends JunitBaseMockMvcTest{
    @Autowired
    private TipService tipService;

    @Test
    public void testQueryTip(){
        ResultDO<TipInfoListRespBean> resultDO=tipService.queryTips(2,2);
        System.out.println(JSON.toJSONString(resultDO));
    }
}
