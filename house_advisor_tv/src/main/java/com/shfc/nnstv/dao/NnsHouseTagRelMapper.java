package com.shfc.nnstv.dao;

import com.shfc.nnstv.domain.NnsHouseTagRel;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.shfc.nnstv.dao.NnsHouseTagRelMapper.java
 * @Description: 置业顾问房源标签关系表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
@Repository
public interface NnsHouseTagRelMapper {
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
    int insert(NnsHouseTagRel record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(NnsHouseTagRel record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param id
     * @return com.shfc.nnstv.domain.NnsHouseTagRel
     * @throws []
     */
    NnsHouseTagRel selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(NnsHouseTagRel record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(NnsHouseTagRel record);
}