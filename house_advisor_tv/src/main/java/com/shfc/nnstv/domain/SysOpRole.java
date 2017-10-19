package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.SysOpRole.java
 * @Description: 运营系统管理角色表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysOpRole extends BaseBean {
    private String arName;

    private Short adId;

    private Date arTimeCreate;

    private Date arTimeUpdate;

    private Integer arStatus;

    /**
     * @return ar_name
     */
    public String getArName() {
        return arName;
    }

    /**
     * @param arName
     */
    public void setArName(String arName) {
        this.arName = arName == null ? null : arName.trim();
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
     * @return ar_time_create
     */
    public Date getArTimeCreate() {
        return arTimeCreate;
    }

    /**
     * @param arTimeCreate
     */
    public void setArTimeCreate(Date arTimeCreate) {
        this.arTimeCreate = arTimeCreate;
    }

    /**
     * @return ar_time_update
     */
    public Date getArTimeUpdate() {
        return arTimeUpdate;
    }

    /**
     * @param arTimeUpdate
     */
    public void setArTimeUpdate(Date arTimeUpdate) {
        this.arTimeUpdate = arTimeUpdate;
    }

    /**
     * @return ar_status
     */
    public Integer getArStatus() {
        return arStatus;
    }

    /**
     * @param arStatus
     */
    public void setArStatus(Integer arStatus) {
        this.arStatus = arStatus;
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
        sb.append(", arName=").append(arName);
        sb.append(", adId=").append(adId);
        sb.append(", arTimeCreate=").append(arTimeCreate);
        sb.append(", arTimeUpdate=").append(arTimeUpdate);
        sb.append(", arStatus=").append(arStatus);
        sb.append("]");
        return sb.toString();
    }
}