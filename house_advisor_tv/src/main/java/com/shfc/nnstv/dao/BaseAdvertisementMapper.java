package com.shfc.nnstv.dao;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.domain.BaseAdvertisement;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.shfc.nnstv.dao.BaseAdvertisementMapper.java
 * @Description: 广告
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
@Repository
public interface BaseAdvertisementMapper {
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
    int insert(BaseAdvertisement record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(BaseAdvertisement record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param id
     * @return com.shfc.nnstv.domain.BaseAdvertisement
     * @throws []
     */
    BaseAdvertisement selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(BaseAdvertisement record);

    /**
     * @Title updateByPrimaryKeyWithBLOBs
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeyWithBLOBs(BaseAdvertisement record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(BaseAdvertisement record);

    /**
     * @Description: 分页获取全部数据库记录
     * @Title selectByPage
     * @Author liaozm
     * @Date 2017/05/12 15:18
     * @return null
     * @throws []
     */
    List<BaseAdvertisement> selectByPage(Page<BaseAdvertisement> page);


    /**
     * @Description: 根据页面查询广告列表
     * @Title advList
     * @Author 吴开阳
     * @Date 2017/04/20 14:04
     * @param page
     * @return int
     * @throws []
     */
    List<AdvertisementInfoBean> advList(String page);
}