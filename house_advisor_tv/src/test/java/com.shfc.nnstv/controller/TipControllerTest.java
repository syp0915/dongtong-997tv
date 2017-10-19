package com.shfc.nnstv.controller;

import com.alibaba.fastjson.JSON;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.req.TipsListReqBean;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-27 09:47
 **/
public class TipControllerTest extends JunitBaseMockMvcTest {

    @Test
    public void testTipList() throws Exception{
        TipsListReqBean tipsListReqBean=new TipsListReqBean();
        tipsListReqBean.setPageNumber(1);
        tipsListReqBean.setPageSize(10);
        mockMvc.perform(MockMvcRequestBuilders.post("/tips/tipList/v1.0.0")
        .content(JSON.toJSONString(tipsListReqBean).getBytes())
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
