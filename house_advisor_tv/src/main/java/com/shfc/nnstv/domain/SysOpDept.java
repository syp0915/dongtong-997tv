package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.SysOpDept.java
 * @Description: 运营系统管理部门表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysOpDept extends BaseBean {
    private String adName;

    private Short adManager;

    private String adEmail;

    private Date adTimeCreate;

    private Date adTimeUpdate;

    private Integer adStatus;

    private Short adUserCount;

    /**
     * @return ad_name
     */
    public String getAdName() {
        return adName;
    }

    /**
     * @param adName
     */
    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    /**
     * @return ad_manager
     */
    public Short getAdManager() {
        return adManager;
    }

    /**
     * @param adManager
     */
    public void setAdManager(Short adManager) {
        this.adManager = adManager;
    }

    /**
     * @return ad_email
     */
    public String getAdEmail() {
        return adEmail;
    }

    /**
     * @param adEmail
     */
    public void setAdEmail(String adEmail) {
        this.adEmail = adEmail == null ? null : adEmail.trim();
    }

    /**
     * @return ad_time_create
     */
    public Date getAdTimeCreate() {
        return adTimeCreate;
    }

    /**
     * @param adTimeCreate
     */
    public void setAdTimeCreate(Date adTimeCreate) {
        this.adTimeCreate = adTimeCreate;
    }

    /**
     * @return ad_time_update
     */
    public Date getAdTimeUpdate() {
        return adTimeUpdate;
    }

    /**
     * @param adTimeUpdate
     */
    public void setAdTimeUpdate(Date adTimeUpdate) {
        this.adTimeUpdate = adTimeUpdate;
    }

    /**
     * @return ad_status
     */
    public Integer getAdStatus() {
        return adStatus;
    }

    /**
     * @param adStatus
     */
    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }

    /**
     * @return ad_user_count
     */
    public Short getAdUserCount() {
        return adUserCount;
    }

    /**
     * @param adUserCount
     */
    public void setAdUserCount(Short adUserCount) {
        this.adUserCount = adUserCount;
    }

    /**
     * @Title toString
     * @Author Jianguo Li
     * @Date 2017/04/20 14:04
     * @return java.lang.String
     * @throws []
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adName=").append(adName);
        sb.append(", adManager=").append(adManager);
        sb.append(", adEmail=").append(adEmail);
        sb.append(", adTimeCreate=").append(adTimeCreate);
        sb.append(", adTimeUpdate=").append(adTimeUpdate);
        sb.append(", adStatus=").append(adStatus);
        sb.append(", adUserCount=").append(adUserCount);
        sb.append("]");
        return sb.toString();
    }
}