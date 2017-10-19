package com.shfc.nnstv.dao;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.domain.BaseNews;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @Package: com.shfc.nnstv.dao.BaseNewsMapper.java
 * @Description: 新闻
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
@Repository
public interface BaseNewsMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int insert(BaseNews record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(BaseNews record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param id
     * @return com.shfc.nnstv.domain.BaseNews
     * @throws []
     */
    BaseNews selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(BaseNews record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(BaseNews record);

    /**
     * @Description: 根据查询条件查询新闻列表
     * @Title newsList
     * @Author 吴开阳
     * @Date 2017/04/20 14:04
     * @param query
     * @return int
     * @throws []
     */
    List<HashMap<String,Object>> newsList(Page<HashMap<String,Object>> query);

    NewsContentRespBean queryNewsContent(String newsCode);
}