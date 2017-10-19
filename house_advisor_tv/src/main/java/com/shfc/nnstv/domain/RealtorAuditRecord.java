package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.RealtorAuditRecord.java
 * @Description: 经纪人审核记录
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class RealtorAuditRecord extends BaseBean {
    /**
     * 经纪人Id
     */
    private Long realtorId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 姓名
     */
    private String name;

    /**
     * 所属门店
     */
    private String storeName;

    /**
     * 所属公司
     */
    private String companyName;

    /**
     * 审核结果(0通过、1不通过)
     */
    private Integer result;

    /**
     * 不通过原因
     */
    private String notPassCause;

    /**
     * 审核人
     */
    private String auditorName;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 获取经纪人Id
     *
     * @return realtor_id
     */
    public Long getRealtorId() {
        return realtorId;
    }

    /**
     * 设置经纪人Id
     *
     * @param realtorId
     */
    public void setRealtorId(Long realtorId) {
        this.realtorId = realtorId;
    }

    /**
     * 获取手机号
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取姓名
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取所属门店
     *
     * @return store_name
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置所属门店
     *
     * @param storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 获取所属公司
     *
     * @return company_name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置所属公司
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取审核结果(0通过、1不通过)
     *
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置审核结果(0通过、1不通过)
     *
     * @param result
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取不通过原因
     *
     * @return not_pass_cause
     */
    public String getNotPassCause() {
        return notPassCause;
    }

    /**
     * 设置不通过原因
     *
     * @param notPassCause
     */
    public void setNotPassCause(String notPassCause) {
        this.notPassCause = notPassCause == null ? null : notPassCause.trim();
    }

    /**
     * 获取审核人
     *
     * @return auditor_name
     */
    public String getAuditorName() {
        return auditorName;
    }

    /**
     * 设置审核人
     *
     * @param auditorName
     */
    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    /**
     * 获取审核时间
     *
     * @return audit_time
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置审核时间
     *
     * @param auditTime
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
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
        sb.append(", realtorId=").append(realtorId);
        sb.append(", phone=").append(phone);
        sb.append(", name=").append(name);
        sb.append(", storeName=").append(storeName);
        sb.append(", companyName=").append(companyName);
        sb.append(", result=").append(result);
        sb.append(", notPassCause=").append(notPassCause);
        sb.append(", auditorName=").append(auditorName);
        sb.append(", auditTime=").append(auditTime);
        sb.append("]");
        return sb.toString();
    }
}