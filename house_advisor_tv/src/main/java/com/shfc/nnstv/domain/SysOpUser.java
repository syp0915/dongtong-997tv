package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.SysOpUser.java
 * @Description: 运营系统管理用户表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysOpUser extends BaseBean {
    private String auName;

    private String auPassword;

    private Short adId;

    private String auEmail;

    private String auMobile;

    private Date auTimeCreate;

    private Date auTimeUpdate;

    private Integer auStatus;

    private String auRoleIds;

    private Integer auLoginCount;

    private Date auLoginTime;

    /**
     * @return au_name
     */
    public String getAuName() {
        return auName;
    }

    /**
     * @param auName
     */
    public void setAuName(String auName) {
        this.auName = auName == null ? null : auName.trim();
    }

    /**
     * @return au_password
     */
    public String getAuPassword() {
        return auPassword;
    }

    /**
     * @param auPassword
     */
    public void setAuPassword(String auPassword) {
        this.auPassword = auPassword == null ? null : auPassword.trim();
    }

    /**
     * @return ad_id
     */
    public Short getAdId() {
        return adId;
    }

    /**
     * @param adId
     */
    public void setAdId(Short adId) {
        this.adId = adId;
    }

    /**
     * @return au_email
     */
    public String getAuEmail() {
        return auEmail;
    }

    /**
     * @param auEmail
     */
    public void setAuEmail(String auEmail) {
        this.auEmail = auEmail == null ? null : auEmail.trim();
    }

    /**
     * @return au_mobile
     */
    public String getAuMobile() {
        return auMobile;
    }

    /**
     * @param auMobile
     */
    public void setAuMobile(String auMobile) {
        this.auMobile = auMobile == null ? null : auMobile.trim();
    }

    /**
     * @return au_time_create
     */
    public Date getAuTimeCreate() {
        return auTimeCreate;
    }

    /**
     * @param auTimeCreate
     */
    public void setAuTimeCreate(Date auTimeCreate) {
        this.auTimeCreate = auTimeCreate;
    }

    /**
     * @return au_time_update
     */
    public Date getAuTimeUpdate() {
        return auTimeUpdate;
    }

    /**
     * @param auTimeUpdate
     */
    public void setAuTimeUpdate(Date auTimeUpdate) {
        this.auTimeUpdate = auTimeUpdate;
    }

    /**
     * @return au_status
     */
    public Integer getAuStatus() {
        return auStatus;
    }

    /**
     * @param auStatus
     */
    public void setAuStatus(Integer auStatus) {
        this.auStatus = auStatus;
    }

    /**
     * @return au_role_ids
     */
    public String getAuRoleIds() {
        return auRoleIds;
    }

    /**
     * @param auRoleIds
     */
    public void setAuRoleIds(String auRoleIds) {
        this.auRoleIds = auRoleIds == null ? null : auRoleIds.trim();
    }

    /**
     * @return au_login_count
     */
    public Integer getAuLoginCount() {
        return auLoginCount;
    }

    /**
     * @param auLoginCount
     */
    public void setAuLoginCount(Integer auLoginCount) {
        this.auLoginCount = auLoginCount;
    }

    /**
     * @return au_login_time
     */
    public Date getAuLoginTime() {
        return auLoginTime;
    }

    /**
     * @param auLoginTime
     */
    public void setAuLoginTime(Date auLoginTime) {
        this.auLoginTime = auLoginTime;
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
        sb.append(", auName=").append(auName);
        sb.append(", auPassword=").append(auPassword);
        sb.append(", adId=").append(adId);
        sb.append(", auEmail=").append(auEmail);
        sb.append(", auMobile=").append(auMobile);
        sb.append(", auTimeCreate=").append(auTimeCreate);
        sb.append(", auTimeUpdate=").append(auTimeUpdate);
        sb.append(", auStatus=").append(auStatus);
        sb.append(", auRoleIds=").append(auRoleIds);
        sb.append(", auLoginCount=").append(auLoginCount);
        sb.append(", auLoginTime=").append(auLoginTime);
        sb.append("]");
        return sb.toString();
    }
}