package com.shfc.nnstv.dao;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.domain.BaseTips;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @Package: com.shfc.nnstv.dao.BaseTipsMapper.java
 * @Description: 交易小贴士
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author sun ya ping
 * @date 2017/08/03 10:04
 * version v1.0.0
 */
@Repository
public interface BaseTipsMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param record
     * @return int
     * @throws []
     */
    int insert(BaseTips record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(BaseTips record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param id
     * @return com.shfc.nnstv.domain.BaseTips
     * @throws []
     */
    BaseTips selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(BaseTips record);

    /**
     * @Title updateByPrimaryKeyWithBLOBs
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeyWithBLOBs(BaseTips record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author sun ya ping
     * @Date 2017/08/03 10:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(BaseTips record);

    /**
     * 根据查询条件查询小贴士列表
     * @param query
     * @return
     */
    List<HashMap<String,Object>> queryTip(Page<HashMap<String,Object>> query);
}