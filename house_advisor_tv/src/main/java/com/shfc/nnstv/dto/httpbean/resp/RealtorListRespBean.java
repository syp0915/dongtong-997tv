package com.shfc.nnstv.dto.httpbean.resp;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;


import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.httpbean.resp
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-21 17:34
 * version V1.0.0
 **/
public class RealtorListRespBean extends HttpBaseBean{

    /**
     * 认证经纪人列表
     */
    private List<RealtorInfoBean> realtorInfoBeanList;
    /**
     * 机顶盒位置
     */
    private String currentAddress;

    public List<RealtorInfoBean> getRealtorInfoBeanList() {
        return realtorInfoBeanList;
    }

    public void setRealtorInfoBeanList(List<RealtorInfoBean> realtorInfoBeanList) {
        this.realtorInfoBeanList = realtorInfoBeanList;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
}
