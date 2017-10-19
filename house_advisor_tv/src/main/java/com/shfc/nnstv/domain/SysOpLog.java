package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.SysOpLog.java
 * @Description: 运营系统管理日志表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysOpLog extends BaseBean {
    private Short afId;

    private Short auId;

    private String alRemark;

    private Date alTime;

    private String alIp;

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
     * @return au_id
     */
    public Short getAuId() {
        return auId;
    }

    /**
     * @param auId
     */
    public void setAuId(Short auId) {
        this.auId = auId;
    }

    /**
     * @return al_remark
     */
    public String getAlRemark() {
        return alRemark;
    }

    /**
     * @param alRemark
     */
    public void setAlRemark(String alRemark) {
        this.alRemark = alRemark == null ? null : alRemark.trim();
    }

    /**
     * @return al_time
     */
    public Date getAlTime() {
        return alTime;
    }

    /**
     * @param alTime
     */
    public void setAlTime(Date alTime) {
        this.alTime = alTime;
    }

    /**
     * @return al_ip
     */
    public String getAlIp() {
        return alIp;
    }

    /**
     * @param alIp
     */
    public void setAlIp(String alIp) {
        this.alIp = alIp == null ? null : alIp.trim();
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
        sb.append(", afId=").append(afId);
        sb.append(", auId=").append(auId);
        sb.append(", alRemark=").append(alRemark);
        sb.append(", alTime=").append(alTime);
        sb.append(", alIp=").append(alIp);
        sb.append("]");
        return sb.toString();
    }
}