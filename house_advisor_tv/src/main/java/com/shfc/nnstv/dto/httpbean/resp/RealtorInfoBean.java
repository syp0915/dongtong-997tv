package com.shfc.nnstv.dto.httpbean.resp;

import java.io.Serializable;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.httpbean.resp
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-21 17:28
 * version V1.0.0
 **/
public class RealtorInfoBean implements Serializable {

    /**
     * 经纪人Id
     */
    private Long realId;

    /**
     * 经纪人头像
     */
    private String headPortrait;

    /**
     * 经纪人姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * 委托房源数量
     */
    private  Integer entrustHouseNumber;

    /**
     * 所属门店名称
     */
    private String realStoreName;


    /**
     * 所属公司名称
     */
    private String	realCompanyName;

    /**
     * 认证编号
     */
    private String realtorNumber;

    /**
     * 主营小区
     */
    private String mainPlot;

    public Long getRealId() {
        return realId;
    }

    public void setRealId(Long realId) {
        this.realId = realId;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getEntrustHouseNumber() {
        return entrustHouseNumber;
    }

    public void setEntrustHouseNumber(Integer entrustHouseNumber) {
        this.entrustHouseNumber = entrustHouseNumber;
    }

    public String getRealtorNumber() {
        return realtorNumber;
    }

    public void setRealtorNumber(String realtorNumber) {
        this.realtorNumber = realtorNumber;
    }

    public String getMainPlot() {
        return mainPlot;
    }

    public void setMainPlot(String mainPlot) {
        this.mainPlot = mainPlot;
    }

    public String getRealStoreName() {
        return realStoreName;
    }

    public void setRealStoreName(String realStoreName) {
        this.realStoreName = realStoreName;
    }

    public String getRealCompanyName() {
        return realCompanyName;
    }

    public void setRealCompanyName(String realCompanyName) {
        this.realCompanyName = realCompanyName;
    }
}
