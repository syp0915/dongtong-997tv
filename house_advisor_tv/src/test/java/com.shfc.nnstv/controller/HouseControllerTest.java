package com.shfc.nnstv.controller;

import com.alibaba.fastjson.JSON;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.req.HouseListReqBean;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/26 下午4:08.
 */
public class HouseControllerTest extends JunitBaseMockMvcTest{

    @Test
    public void testHouseList() throws Exception {
        HouseListReqBean houseListReqBean = new HouseListReqBean();
        houseListReqBean.setMac("0019684375FB");
        houseListReqBean.setPageSize(10);
        houseListReqBean.setPageNumber(1);
        mockMvc.perform(MockMvcRequestBuilders.post("/house/houseList/v1.0.0")
                .content(JSON.toJSONString(houseListReqBean).getBytes())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
