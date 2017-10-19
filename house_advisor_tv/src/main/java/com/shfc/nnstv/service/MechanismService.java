package com.shfc.nnstv.service;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.dto.httpbean.resp.HouseListRespBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismCountRespBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismListRespBean;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.service
 * @Description：TODO
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 13:29
 * version V1.0.0
 **/
public interface MechanismService {

    /**
     * 查询认证机构列表
     * @param mac
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public ResultDO<MechanismListRespBean> getMechanismList(String mac,Integer pageSize, Integer pageNumber);


    /**
     * 认证机构统计
     * @param mac
     * @return
     */
    public ResultDO<MechanismCountRespBean> getMechanismCount(String mac);
}
