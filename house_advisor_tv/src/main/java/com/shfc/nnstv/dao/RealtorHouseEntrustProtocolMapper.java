package com.shfc.nnstv.dao;

import com.shfc.nnstv.domain.RealtorHouseEntrustProtocol;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.shfc.nnstv.dao.RealtorHouseEntrustProtocolMapper.java
 * @Description: 997房源委托表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author sun ya ping
 * @date 2017/08/03 09:58
 * version v1.0.0
 */
@Repository
public interface RealtorHouseEntrustProtocolMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 09:58
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author sun ya ping
     * @Date 2017/08/03 09:58
     * @param record
     * @return int
     * @throws []
     */
    int insert(RealtorHouseEntrustProtocol record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author sun ya ping
     * @Date 2017/08/03 09:58
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(RealtorHouseEntrustProtocol record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 09:58
     * @param id
     * @return com.shfc.nnstv.domain.RealtorHouseEntrustProtocol
     * @throws []
     */
    RealtorHouseEntrustProtocol selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author sun ya ping
     * @Date 2017/08/03 09:58
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(RealtorHouseEntrustProtocol record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 09:58
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(RealtorHouseEntrustProtocol record);
}