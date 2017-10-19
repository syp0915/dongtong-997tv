package com.shfc.nnstv.dto.httpbean.resp;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;

import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.httpbean.resp
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-21 17:25
 * version V1.0.0
 **/
public class MechanismListRespBean extends HttpBaseBean{

    /**
     * 认证机构列表
     */
    private List<MechanismBean> mechanismList;

    public List<MechanismBean> getMechanismList() {
        return mechanismList;
    }

    public void setMechanismList(List<MechanismBean> mechanismList) {
        this.mechanismList = mechanismList;
    }
}
