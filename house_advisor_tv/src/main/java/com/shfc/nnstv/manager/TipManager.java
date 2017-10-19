package com.shfc.nnstv.manager;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.dao.BaseTipsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 16:10
 **/
@Service
public class TipManager {
    @Autowired(required = false)
    private BaseTipsMapper baseTipsMapper;

    /**
     * 数据库查询小贴士列表
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public Page<HashMap<String,Object>> queryTip( Integer pageNumber, Integer pageSize){
        Page<HashMap<String, Object>> query = new Page<HashMap<String, Object>>(pageNumber, pageSize);
        HashMap<String, Object> params = new HashMap<String, Object>();

        query.setQuery(params);
        baseTipsMapper.queryTip(query);
        return query;

    }

}
