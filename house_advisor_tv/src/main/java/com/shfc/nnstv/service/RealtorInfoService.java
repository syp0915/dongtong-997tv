package com.shfc.nnstv.service;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.dto.httpbean.resp.RealtorDetailRespBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorListRespBean;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.service
 * @Description：TODO
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 9:44
 * version V1.0.0
 **/
public interface RealtorInfoService {

    /**
     * 经纪人列表
     * @param mac
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public ResultDO<RealtorListRespBean> getRealtorList(String mac,Integer pageSize, Integer pageNumber);

    /**
     * 委托房源量前三经纪人信息
     * @return
     */
    public ResultDO<RealtorListRespBean> getRealtorListByHomePage();


    /**
     * 根据经纪人id查询详情
     * @param id
     * @return
     */
    public ResultDO<RealtorDetailRespBean> selectDetailById(Long id,String mac);

}
