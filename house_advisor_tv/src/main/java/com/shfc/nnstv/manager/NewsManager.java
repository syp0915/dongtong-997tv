package com.shfc.nnstv.manager;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.dao.BaseNewsContentMapper;
import com.shfc.nnstv.dao.BaseNewsMapper;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 09:34
 **/
@Service
public class NewsManager {
    @Autowired(required = false)
    private BaseNewsMapper baseNewsMapper;
    @Autowired(required = false)
    private BaseNewsContentMapper baseNewsContentMapper;

    /**
     * 数据库查询新闻列表
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public Page<HashMap<String,Object>> newsList(Integer pageNumber,Integer pageSize){
        Page<HashMap<String,Object>> page=new Page<HashMap<String,Object>>(pageNumber,pageSize);
        HashMap<String,Object> query=new HashMap<String,Object>();
        query.put("status",0);
        page.setQuery(query);
        baseNewsMapper.newsList(page);
        return page;
    }


    public NewsContentRespBean queryNewsContent(String newsCode){
        return baseNewsMapper.queryNewsContent(newsCode);

    }
}
