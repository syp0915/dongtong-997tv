package com.shfc.nnstv.service;

import com.alibaba.fastjson.JSON;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsInfoListRespBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 10:05
 **/
public class NewsServiceTest extends JunitBaseMockMvcTest {
    @Autowired
    private NewsService newsService;

    @Test
    public void testNewsList(){
        ResultDO<NewsInfoListRespBean> resultDO=newsService.newsList(1,1);
        System.out.println(JSON.toJSONString(resultDO));
    }

    @Test
    public void testQueryNewsContent(){
        ResultDO<NewsContentRespBean> resultDO=newsService.queryNewsContent("3");
        System.out.println(JSON.toJSONString(resultDO));
    }
}
