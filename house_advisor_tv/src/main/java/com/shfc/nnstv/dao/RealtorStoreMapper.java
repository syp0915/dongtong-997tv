package com.shfc.nnstv.dao;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.domain.RealtorStore;
import com.shfc.nnstv.dto.RealtorStoreDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.shfc.nnstv.dao.RealtorStoreMapper.java
 * @Description: 经纪公司门店
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
@Repository
public interface RealtorStoreMapper {

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author Jianguo Li
     * @Date 2017/05/19 17:50
     * @param record
     * @return int
     * @throws []
     */
    int insert(RealtorStore record);

    /**
     * 经纪门店列表
     * @param query
     * @return
     */
    List<RealtorStoreDTO> getMechanismListByCondition(Page<RealtorStoreDTO> query);

    /**
     * 认证经纪门店数
     * @return
     */
    int selectStoreTotal();

    /**
     * 根据门店关联板块查询相应小区
     * @param relId
     * @return
     */
    List<String> selectStorePlot(Long relId);

    /**
     * 根据门店Id查询旗下所有经纪人的主营楼盘
     * @param storeId
     * @return
     */
    List<String> queryStorePlot(Long storeId);

    /**
     * 根据店名查找店铺
     * @param storeName
     * @return
     */
    RealtorStore findStoreByName(String storeName);

}