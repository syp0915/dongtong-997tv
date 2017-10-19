package com.shfc.nnstv.manager;

import com.shfc.common.base.StringUtils;
import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.dao.RealtorInfoMapper;
import com.shfc.nnstv.dao.RealtorStoreMapper;
import com.shfc.nnstv.domain.RealtorInfo;
import com.shfc.nnstv.domain.RealtorStore;
import com.shfc.nnstv.dto.httpbean.resp.RealtorInfoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.manager
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 9:51
 * version V1.0.0
 **/
@Service
public class RealtorInfoManage {

    @Autowired
    private RealtorInfoMapper realtorInfoMapper;


    /**
     * 查询经纪人列表
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public Page<RealtorInfo> getRealtorInfoListByCondition(Integer pageSize, Integer pageNumber){
        Page<RealtorInfo> query = new Page<RealtorInfo>(pageNumber, pageSize);
        realtorInfoMapper.selectList(query);
        return query;
    }

    /**
     * 委托房源量前三的经纪人信息
     * @return
     */
    public List<RealtorInfo> getRealtorInfoList(){
        List<RealtorInfo> realtorInfoList=realtorInfoMapper.selectListByHomePage();
        return realtorInfoList;
    }


    /**
     * 查询经纪人详情
     * @param id
     * @return
     */
    public RealtorInfo selectDetailById(Long id){
        RealtorInfo realtorInfo= realtorInfoMapper.selectDetail(id);
        return realtorInfo;
    }


}
