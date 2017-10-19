package com.shfc.nnstv.dto.httpbean.resp;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 13:57
 **/
public class NewsContentRespBean implements Serializable {
    private String informTitle;// 资讯标题
    private String newsFrom;
    private String publishTime;
    private String informContent;// 资讯内容
    private String informPicUrl;// 资讯图片url
    private String videoUrl;//视频链接
    private String videoPic;//视频封面
    private String digest;//摘要

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle;
    }


    public String getNewsFrom() {
        return newsFrom;
    }

    public void setNewsFrom(String newsFrom) {
        this.newsFrom = newsFrom;
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent;
    }

    public String getInformPicUrl() {
        return informPicUrl;
    }

    public void setInformPicUrl(String informPicUrl) {
        this.informPicUrl = informPicUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoPic() {
        return videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}