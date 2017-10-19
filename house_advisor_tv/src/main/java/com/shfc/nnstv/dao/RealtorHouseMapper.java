package com.shfc.nnstv.dao;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.domain.RealtorHouse;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @Package: com.shfc.nnstv.dao.RealtorHouseMapper.java
 * @Description: 经纪人自有二手房
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author lv bin
 * @date 2017/08/01 16:43
 * version v1.0.0
 */
@Repository
public interface RealtorHouseMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author lv bin
     * @Date 2017/08/01 16:43
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author lv bin
     * @Date 2017/08/01 16:43
     * @param record
     * @return int
     * @throws []
     */
    int insert(RealtorHouse record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author lv bin
     * @Date 2017/08/01 16:43
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(RealtorHouse record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author lv bin
     * @Date 2017/08/01 16:43
     * @param id
     * @return com.shfc.nnstv.domain.RealtorHouse
     * @throws []
     */
    RealtorHouse selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author lv bin
     * @Date 2017/08/01 16:43
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(RealtorHouse record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author lv bin
     * @Date 2017/08/01 16:43
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(RealtorHouse record);

    /**
     * 根据条件查询房源列表
     * @param query
     * @return
     */
    List<HashMap<String, Object>> getHouseListByCondition(Page<HashMap<String, Object>> query);

    /**
     * 根据经纪人Id查询委托房源列表
     * @param query
     * @return
     */
    List<HashMap<String, Object>> getHouseListByRealtorId(Page<HashMap<String, Object>> query);
}