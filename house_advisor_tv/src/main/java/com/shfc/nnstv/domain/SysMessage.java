package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.SysMessage.java
 * @Description: 系统消息表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysMessage extends BaseBean {
    /**
     * 消息来源(SYS("系统推送",0),SHFC("上海房产", 1),TV_997("997项目", 2))
     */
    private Integer mesFrom;

    /**
     * 消息类型(0预约看房、1房源委托、2日程提醒、3资金监管、4系统通知、5谁约看我的房子、6委托宝, 7佣金宝,8活动
     */
    private Integer mesType;

    /**
     * 业务ID
     */
    private Long bizId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 1.经纪人，2.用户，3.销售人员
     */
    private Integer userType;

    /**
     * 消息摘要
     */
    private String mesDigest;

    /**
     * 消息内容
     */
    private String mesContent;

    /**
     * 状态(0.未读、1.已读)
     */
    private Integer status;

    /**
     * 获取消息来源(SYS("系统推送",0),SHFC("上海房产", 1),TV_997("997项目", 2))
     *
     * @return mes_from
     */
    public Integer getMesFrom() {
        return mesFrom;
    }

    /**
     * 设置消息来源(SYS("系统推送",0),SHFC("上海房产", 1),TV_997("997项目", 2))
     *
     * @param mesFrom
     */
    public void setMesFrom(Integer mesFrom) {
        this.mesFrom = mesFrom;
    }

    /**
     * 获取消息类型(0预约看房、1房源委托、2日程提醒、3资金监管、4系统通知、5谁约看我的房子、6委托宝, 7佣金宝,8活动
     *
     * @return mes_type
     */
    public Integer getMesType() {
        return mesType;
    }

    /**
     * 设置消息类型(0预约看房、1房源委托、2日程提醒、3资金监管、4系统通知、5谁约看我的房子、6委托宝, 7佣金宝,8活动
     *
     * @param mesType
     */
    public void setMesType(Integer mesType) {
        this.mesType = mesType;
    }

    /**
     * 获取业务ID
     *
     * @return biz_id
     */
    public Long getBizId() {
        return bizId;
    }

    /**
     * 设置业务ID
     *
     * @param bizId
     */
    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取1.经纪人，2.用户，3.销售人员
     *
     * @return user_type
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置1.经纪人，2.用户，3.销售人员
     *
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取消息摘要
     *
     * @return mes_digest
     */
    public String getMesDigest() {
        return mesDigest;
    }

    /**
     * 设置消息摘要
     *
     * @param mesDigest
     */
    public void setMesDigest(String mesDigest) {
        this.mesDigest = mesDigest == null ? null : mesDigest.trim();
    }

    /**
     * 获取消息内容
     *
     * @return mes_content
     */
    public String getMesContent() {
        return mesContent;
    }

    /**
     * 设置消息内容
     *
     * @param mesContent
     */
    public void setMesContent(String mesContent) {
        this.mesContent = mesContent == null ? null : mesContent.trim();
    }

    /**
     * 获取状态(0.未读、1.已读)
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(0.未读、1.已读)
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", mesFrom=").append(mesFrom);
        sb.append(", mesType=").append(mesType);
        sb.append(", bizId=").append(bizId);
        sb.append(", userId=").append(userId);
        sb.append(", userType=").append(userType);
        sb.append(", mesDigest=").append(mesDigest);
        sb.append(", mesContent=").append(mesContent);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}