package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.SysOpFunction.java
 * @Description: 运营系统管理功能表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class SysOpFunction extends BaseBean {
    private String afApp;

    private String afModule;

    private String afAction;

    private String afName;

    private String afDescription;

    private Integer afMenuOn;

    private Short afMenuOrder;

    private String afMenuUrl;

    private Boolean afLog;

    private Date afTimeCreate;

    private Date afTimeUpdate;

    private Integer afStatus;

    private Integer afDoneCount;

    /**
     * @return af_app
     */
    public String getAfApp() {
        return afApp;
    }

    /**
     * @param afApp
     */
    public void setAfApp(String afApp) {
        this.afApp = afApp == null ? null : afApp.trim();
    }

    /**
     * @return af_module
     */
    public String getAfModule() {
        return afModule;
    }

    /**
     * @param afModule
     */
    public void setAfModule(String afModule) {
        this.afModule = afModule == null ? null : afModule.trim();
    }

    /**
     * @return af_action
     */
    public String getAfAction() {
        return afAction;
    }

    /**
     * @param afAction
     */
    public void setAfAction(String afAction) {
        this.afAction = afAction == null ? null : afAction.trim();
    }

    /**
     * @return af_name
     */
    public String getAfName() {
        return afName;
    }

    /**
     * @param afName
     */
    public void setAfName(String afName) {
        this.afName = afName == null ? null : afName.trim();
    }

    /**
     * @return af_description
     */
    public String getAfDescription() {
        return afDescription;
    }

    /**
     * @param afDescription
     */
    public void setAfDescription(String afDescription) {
        this.afDescription = afDescription == null ? null : afDescription.trim();
    }

    /**
     * @return af_menu_on
     */
    public Integer getAfMenuOn() {
        return afMenuOn;
    }

    /**
     * @param afMenuOn
     */
    public void setAfMenuOn(Integer afMenuOn) {
        this.afMenuOn = afMenuOn;
    }

    /**
     * @return af_menu_order
     */
    public Short getAfMenuOrder() {
        return afMenuOrder;
    }

    /**
     * @param afMenuOrder
     */
    public void setAfMenuOrder(Short afMenuOrder) {
        this.afMenuOrder = afMenuOrder;
    }

    /**
     * @return af_menu_url
     */
    public String getAfMenuUrl() {
        return afMenuUrl;
    }

    /**
     * @param afMenuUrl
     */
    public void setAfMenuUrl(String afMenuUrl) {
        this.afMenuUrl = afMenuUrl == null ? null : afMenuUrl.trim();
    }

    /**
     * @return af_log
     */
    public Boolean getAfLog() {
        return afLog;
    }

    /**
     * @param afLog
     */
    public void setAfLog(Boolean afLog) {
        this.afLog = afLog;
    }

    /**
     * @return af_time_create
     */
    public Date getAfTimeCreate() {
        return afTimeCreate;
    }

    /**
     * @param afTimeCreate
     */
    public void setAfTimeCreate(Date afTimeCreate) {
        this.afTimeCreate = afTimeCreate;
    }

    /**
     * @return af_time_update
     */
    public Date getAfTimeUpdate() {
        return afTimeUpdate;
    }

    /**
     * @param afTimeUpdate
     */
    public void setAfTimeUpdate(Date afTimeUpdate) {
        this.afTimeUpdate = afTimeUpdate;
    }

    /**
     * @return af_status
     */
    public Integer getAfStatus() {
        return afStatus;
    }

    /**
     * @param afStatus
     */
    public void setAfStatus(Integer afStatus) {
        this.afStatus = afStatus;
    }

    /**
     * @return af_done_count
     */
    public Integer getAfDoneCount() {
        return afDoneCount;
    }

    /**
     * @param afDoneCount
     */
    public void setAfDoneCount(Integer afDoneCount) {
        this.afDoneCount = afDoneCount;
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
        sb.append(", afApp=").append(afApp);
        sb.append(", afModule=").append(afModule);
        sb.append(", afAction=").append(afAction);
        sb.append(", afName=").append(afName);
        sb.append(", afDescription=").append(afDescription);
        sb.append(", afMenuOn=").append(afMenuOn);
        sb.append(", afMenuOrder=").append(afMenuOrder);
        sb.append(", afMenuUrl=").append(afMenuUrl);
        sb.append(", afLog=").append(afLog);
        sb.append(", afTimeCreate=").append(afTimeCreate);
        sb.append(", afTimeUpdate=").append(afTimeUpdate);
        sb.append(", afStatus=").append(afStatus);
        sb.append(", afDoneCount=").append(afDoneCount);
        sb.append("]");
        return sb.toString();
    }
}