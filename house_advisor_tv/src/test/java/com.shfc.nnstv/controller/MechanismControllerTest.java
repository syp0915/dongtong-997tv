package com.shfc.nnstv.controller;

import com.alibaba.fastjson.JSON;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.req.MechanismListReqBean;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.controller
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-27 9:05
 * version V1.0.0
 **/
public class MechanismControllerTest extends JunitBaseMockMvcTest {

    @Test
    public void testMechanismList() throws Exception {
        MechanismListReqBean mechanismListReqBean = new MechanismListReqBean();
        mechanismListReqBean.setMac("0019684375FB");
        mechanismListReqBean.setPageSize(10);
        mechanismListReqBean.setPageNumber(1);
        mockMvc.perform(MockMvcRequestBuilders.post("/mechanism/mechanismList/v1.0.0")
                .content(JSON.toJSONString(mechanismListReqBean).getBytes())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void testMechanismTotal() throws Exception {
        MechanismListReqBean mechanismListReqBean = new MechanismListReqBean();
        mechanismListReqBean.setMac("0019684375FB");
        mockMvc.perform(MockMvcRequestBuilders.post("/mechanism/mechanismTotal/v1.0.0")
                .content(JSON.toJSONString(mechanismListReqBean).getBytes())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
