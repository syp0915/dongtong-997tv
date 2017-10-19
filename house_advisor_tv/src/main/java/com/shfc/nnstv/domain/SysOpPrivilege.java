package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.SysOpPrivilege.java
 * @Description: 运营系统管理权限表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysOpPrivilege extends BaseBean {
    private Integer apObject;

    private Short apObjectId;

    private Short afId;

    private Date apTimeCreate;

    private Date apTimeUpdate;

    private Integer apStatus;

    /**
     * @return ap_object
     */
    public Integer getApObject() {
        return apObject;
    }

    /**
     * @param apObject
     */
    public void setApObject(Integer apObject) {
        this.apObject = apObject;
    }

    /**
     * @return ap_object_id
     */
    public Short getApObjectId() {
        return apObjectId;
    }

    /**
     * @param apObjectId
     */
    public void setApObjectId(Short apObjectId) {
        this.apObjectId = apObjectId;
    }

    /**
     * @return af_id
     */
    public Short getAfId() {
        return afId;
    }

    /**
     * @param afId
     */
    public void setAfId(Short afId) {
        this.afId = afId;
    }

    /**
     * @return ap_time_create
     */
    public Date getApTimeCreate() {
        return apTimeCreate;
    }

    /**
     * @param apTimeCreate
     */
    public void setApTimeCreate(Date apTimeCreate) {
        this.apTimeCreate = apTimeCreate;
    }

    /**
     * @return ap_time_update
     */
    public Date getApTimeUpdate() {
        return apTimeUpdate;
    }

    /**
     * @param apTimeUpdate
     */
    public void setApTimeUpdate(Date apTimeUpdate) {
        this.apTimeUpdate = apTimeUpdate;
    }

    /**
     * @return ap_status
     */
    public Integer getApStatus() {
        return apStatus;
    }

    /**
     * @param apStatus
     */
    public void setApStatus(Integer apStatus) {
        this.apStatus = apStatus;
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
        sb.append(", apObject=").append(apObject);
        sb.append(", apObjectId=").append(apObjectId);
        sb.append(", afId=").append(afId);
        sb.append(", apTimeCreate=").append(apTimeCreate);
        sb.append(", apTimeUpdate=").append(apTimeUpdate);
        sb.append(", apStatus=").append(apStatus);
        sb.append("]");
        return sb.toString();
    }
}