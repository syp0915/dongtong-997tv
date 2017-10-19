package com.shfc.nnstv.dto.httpbean.resp;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.httpbean.resp
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-21 18:06
 * version V1.0.0
 **/
public class MechanismCountRespBean {

    /**
     *  认证公司数
     */
    private Integer companyTotal;

    /**
     * 认证经纪门店数
     */
    private Integer realtorStoreTotal;

    /**
     * 机顶盒位置
     */
    private String currentAddress;

    /**
     * 服务器时间
     */
    private String serverTime;

    public Integer getCompanyTotal() {
        return companyTotal;
    }

    public void setCompanyTotal(Integer companyTotal) {
        this.companyTotal = companyTotal;
    }

    public Integer getRealtorStoreTotal() {
        return realtorStoreTotal;
    }

    public void setRealtorStoreTotal(Integer realtorStoreTotal) {
        this.realtorStoreTotal = realtorStoreTotal;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }
}
