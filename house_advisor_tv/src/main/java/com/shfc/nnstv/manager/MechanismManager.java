package com.shfc.nnstv.manager;

import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.dao.RealtorCompanyMapper;
import com.shfc.nnstv.dao.RealtorStoreMapper;
import com.shfc.nnstv.domain.RealtorInfo;
import com.shfc.nnstv.domain.RealtorStore;
import com.shfc.nnstv.dto.RealtorStoreDTO;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.manager
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 13:32
 * version V1.0.0
 **/
@Service
public class MechanismManager {

    @Autowired(required = false)
    private RealtorStoreMapper realtorStoreMapper;

    @Autowired(required = false)
    private RealtorCompanyMapper realtorCompanyMapper;


    /**
     * 查询机构列表
     * @param latitude
     * @param longitude
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public Page<RealtorStoreDTO> getMechanismListByCondition(double latitude, double longitude, Integer pageSize, Integer pageNumber){
        Page<RealtorStoreDTO> query = new Page<RealtorStoreDTO>(pageNumber, pageSize);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("longitude", longitude);
        params.put("latitude", latitude);
        query.setQuery(params);
        realtorStoreMapper.getMechanismListByCondition(query);
        return query;
    }


    /**
     * 认证机构统计
     * @return
     */
    public HashMap<String,Integer> getTotal(){
        HashMap<String,Integer> hashMap=new HashMap<>();
        int storeTotal= realtorStoreMapper.selectStoreTotal();
        int companyTotal=realtorCompanyMapper.selectCompanyTotal();
        hashMap.put("companyTotal",companyTotal);
        hashMap.put("realtorStoreTotal",storeTotal);
        return hashMap;
    }

    /**
     * 根据关联关系查询主营小区
     * @return
     */
    public List<String> getPlotName(Long relId){
        return realtorStoreMapper.selectStorePlot(relId);
    }

    /**
     * 根据门店Id查询旗下所有经纪人的主营楼盘
     * @param storeId
     * @return
     */
    public List<String> queryPlotName(Long storeId){
        return realtorStoreMapper.queryStorePlot(storeId);
    }


}
