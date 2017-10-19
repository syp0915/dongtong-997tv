package com.shfc.nnstv.dto.httpbean.resp;

import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.httpbean.resp
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-21 17:58
 * version V1.0.0
 **/
public class RealtorDetailRespBean {

    /**
     * 经纪人信息
     */
    private RealtorInfoBean realtorInfoBean;

    /**
     * 最近的认证房源
     */
    private List<HouseInfoBean> houseList;

    public RealtorInfoBean getRealtorInfoBean() {
        return realtorInfoBean;
    }

    public void setRealtorInfoBean(RealtorInfoBean realtorInfoBean) {
        this.realtorInfoBean = realtorInfoBean;
    }

    public List<HouseInfoBean> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<HouseInfoBean> houseList) {
        this.houseList = houseList;
    }
}
