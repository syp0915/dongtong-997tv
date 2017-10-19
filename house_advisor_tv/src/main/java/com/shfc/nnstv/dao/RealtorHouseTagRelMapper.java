package com.shfc.nnstv.dao;

import com.shfc.nnstv.domain.RealtorHouseTagRel;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.shfc.nnstv.dao.RealtorHouseTagRelMapper.java
 * @Description: 二手房标签关联表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author lv bin
 * @date 2017/08/01 17:38
 * version v1.0.0
 */
@Repository
public interface RealtorHouseTagRelMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author lv bin
     * @Date 2017/08/01 17:38
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author lv bin
     * @Date 2017/08/01 17:38
     * @param record
     * @return int
     * @throws []
     */
    int insert(RealtorHouseTagRel record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author lv bin
     * @Date 2017/08/01 17:38
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(RealtorHouseTagRel record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author lv bin
     * @Date 2017/08/01 17:38
     * @param id
     * @return com.shfc.nnstv.domain.RealtorHouseTagRel
     * @throws []
     */
    RealtorHouseTagRel selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author lv bin
     * @Date 2017/08/01 17:38
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(RealtorHouseTagRel record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author lv bin
     * @Date 2017/08/01 17:38
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(RealtorHouseTagRel record);
}