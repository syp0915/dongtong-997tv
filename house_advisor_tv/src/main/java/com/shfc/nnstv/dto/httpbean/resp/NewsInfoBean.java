package com.shfc.nnstv.dto.httpbean.resp;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 09:25
 **/
public class NewsInfoBean implements Serializable {
    private String informTitle;
    private String picUrl;
    private String flag;//0:纯文本,1:图片，2：视频
    private String informUrl;
    private Integer informId;
    private String newsFrom;
    private String publishTime;
    private String isTop;


    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getInformUrl() {
        return informUrl;
    }

    public void setInformUrl(String informUrl) {
        this.informUrl = informUrl;
    }

    public Integer getInformId() {
        return informId;
    }

    public void setInformId(Integer informId) {
        this.informId = informId;
    }

    public String getNewsFrom() {
        return newsFrom;
    }

    public void setNewsFrom(String newsFrom) {
        this.newsFrom = newsFrom;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

}
