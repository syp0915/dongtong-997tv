package com.shfc.nnstv.dao;

import com.shfc.nnstv.domain.RealtorHouseStatusFlow;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.shfc.nnstv.dao.RealtorHouseStatusFlowMapper.java
 * @Description: 997房源状态流表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author sun ya ping
 * @date 2017/08/03 10:07
 * version v1.0.0
 */
@Repository
public interface RealtorHouseStatusFlowMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 10:07
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author sun ya ping
     * @Date 2017/08/03 10:07
     * @param record
     * @return int
     * @throws []
     */
    int insert(RealtorHouseStatusFlow record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author sun ya ping
     * @Date 2017/08/03 10:07
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(RealtorHouseStatusFlow record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 10:07
     * @param id
     * @return com.shfc.nnstv.domain.RealtorHouseStatusFlow
     * @throws []
     */
    RealtorHouseStatusFlow selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author sun ya ping
     * @Date 2017/08/03 10:07
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(RealtorHouseStatusFlow record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 10:07
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(RealtorHouseStatusFlow record);
}