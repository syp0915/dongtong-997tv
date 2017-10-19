package com.shfc.nnstv.dto.httpbean.resp;

import java.io.Serializable;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.httpbean.resp
 * @Description：认证机构返回实体bean
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-21 16:59
 * version V1.0.0
 **/
public class MechanismBean implements Serializable {

    /**
     * 经纪公司logo
     */
    private String companyImg;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 主营小区
     */
    private String mainPlot;

    /**
     * 所属公司名称
     */
    private String	companyName;

    public String getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getMainPlot() {
        return mainPlot;
    }

    public void setMainPlot(String mainPlot) {
        this.mainPlot = mainPlot;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
