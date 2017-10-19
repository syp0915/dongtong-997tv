package com.shfc.nnstv.controller;

import com.shfc.nnstv.JunitBaseMockMvcTest;
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
 * @create 2017-04-27 09:59
 **/
public class NewsControlllerTest extends JunitBaseMockMvcTest {
    @Test
    public void testNewsList() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/news/newsList/v1.0.0")
                .content("{\"pageNumber\":1,\"pageSize\":10}")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

    }


    @Test
    public void testNewsDetail() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/news/newsDetail/v1.0.0")
        .content("{\"informId\":\"1\"}".getBytes())
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .accept("application/json;charset=utf-8"))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=utf-8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
