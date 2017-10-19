package com.shfc.nnstv.dao;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.domain.RealtorInfo;
import com.shfc.nnstv.domain.RealtorStore;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @Package: com.shfc.nnstv.dao.RealtorInfoMapper.java
 * @Description: 经纪人基本信息表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
@Repository
public interface RealtorInfoMapper {
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
    int insert(RealtorInfo record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(RealtorInfo record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param id
     * @return com.shfc.nnstv.domain.RealtorInfo
     * @throws []
     */
    RealtorInfo selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(RealtorInfo record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(RealtorInfo record);


    /**
     * 查询委托房源量前三的经纪人信息
     * @return
     */
    List<RealtorInfo> selectListByHomePage();


    /**
     * 认证经纪人列表
     * @param query
     * @return
     */
    List<RealtorInfo> selectList(Page<RealtorInfo> query);

    /**
     * 查询经纪人详情
     * @param id
     * @return
     */
    RealtorInfo selectDetail(Long id);

}