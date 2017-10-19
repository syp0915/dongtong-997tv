package com.shfc.nnstv.controller;

import com.alibaba.fastjson.JSON;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.req.RealtorDetailReqBean;
import com.shfc.nnstv.dto.httpbean.req.RealtorListReqBean;
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
 * @date 2017-04-27 9:19
 * version V1.0.0
 **/
public class RealtorInfoControllerTest extends JunitBaseMockMvcTest {

    @Test
    public void testRealtorList() throws Exception {
        RealtorListReqBean realtorListReqBean = new RealtorListReqBean();
        realtorListReqBean.setMac("0019684375FB");
        realtorListReqBean.setPageSize(10);
        realtorListReqBean.setPageNumber(1);
        realtorListReqBean.setDisplayPosition(1);
        mockMvc.perform(MockMvcRequestBuilders.post("/realtor/realtorList/v1.0.0")
                .content(JSON.toJSONString(realtorListReqBean).getBytes())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void testRealtorDetail() throws Exception {
        RealtorDetailReqBean realtorDetailReqBean = new RealtorDetailReqBean();
        realtorDetailReqBean.setRealtorId("10");
        mockMvc.perform(MockMvcRequestBuilders.post("/realtor/realtorDetail/v1.0.0")
                .content(JSON.toJSONString(realtorDetailReqBean).getBytes())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
