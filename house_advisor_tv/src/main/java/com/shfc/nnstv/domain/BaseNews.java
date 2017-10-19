package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;
import java.util.Date;

/**
 * @Package: com.shfc.nnstv.domain.BaseNews.java
 * @Description: 新闻
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class BaseNews extends BaseBean {
    /**
     * 资讯编号
     */
    private String newsCode;

    /**
     * 新闻标题
     */
    private String newsTitle;

    /**
     * 新闻摘要
     */
    private String newsDigest;

    /**
     * 新闻链接
     */
    private String newsUrl;

    /**
     * 图片链接
     */
    private String newsPicUrl;

    /**
     * 新闻来源
     */
    private String newsFrom;

    /**
     * 新闻状态 1.草稿,2.已发布3.已撤回
     */
    private Integer status;

    /**
     * 浏览次数
     */
    private Integer browsingTimes;

    /**
     * 是否置顶（0：否，1：是）
     */
    private String isTop;

    /**
     * 视频链接
     */
    private String videoUrl;

    /**
     * 视频封面
     */
    private String videoPic;

    /**
     * 生效时间
     */
    private Date beginTime;

    /**
     * 失效时间
     */
    private Date endTime;

    /**
     * 获取资讯编号
     *
     * @return news_code
     */
    public String getNewsCode() {
        return newsCode;
    }

    /**
     * 设置资讯编号
     *
     * @param newsCode
     */
    public void setNewsCode(String newsCode) {
        this.newsCode = newsCode == null ? null : newsCode.trim();
    }

    /**
     * 获取新闻标题
     *
     * @return news_title
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * 设置新闻标题
     *
     * @param newsTitle
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    /**
     * 获取新闻摘要
     *
     * @return news_digest
     */
    public String getNewsDigest() {
        return newsDigest;
    }

    /**
     * 设置新闻摘要
     *
     * @param newsDigest
     */
    public void setNewsDigest(String newsDigest) {
        this.newsDigest = newsDigest == null ? null : newsDigest.trim();
    }

    /**
     * 获取新闻链接
     *
     * @return news_url
     */
    public String getNewsUrl() {
        return newsUrl;
    }

    /**
     * 设置新闻链接
     *
     * @param newsUrl
     */
    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    /**
     * 获取图片链接
     *
     * @return news_pic_url
     */
    public String getNewsPicUrl() {
        return newsPicUrl;
    }

    /**
     * 设置图片链接
     *
     * @param newsPicUrl
     */
    public void setNewsPicUrl(String newsPicUrl) {
        this.newsPicUrl = newsPicUrl == null ? null : newsPicUrl.trim();
    }

    /**
     * 获取新闻来源
     *
     * @return news_from
     */
    public String getNewsFrom() {
        return newsFrom;
    }

    /**
     * 设置新闻来源
     *
     * @param newsFrom
     */
    public void setNewsFrom(String newsFrom) {
        this.newsFrom = newsFrom == null ? null : newsFrom.trim();
    }

    /**
     * 获取新闻状态 1.草稿,2.已发布3.已撤回
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置新闻状态 1.草稿,2.已发布3.已撤回
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取浏览次数
     *
     * @return browsing_times
     */
    public Integer getBrowsingTimes() {
        return browsingTimes;
    }

    /**
     * 设置浏览次数
     *
     * @param browsingTimes
     */
    public void setBrowsingTimes(Integer browsingTimes) {
        this.browsingTimes = browsingTimes;
    }

    /**
     * 获取是否置顶（0：否，1：是）
     *
     * @return is_top
     */
    public String getIsTop() {
        return isTop;
    }

    /**
     * 设置是否置顶（0：否，1：是）
     *
     * @param isTop
     */
    public void setIsTop(String isTop) {
        this.isTop = isTop == null ? null : isTop.trim();
    }

    /**
     * 获取视频链接
     *
     * @return video_url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置视频链接
     *
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
     * 获取视频封面
     *
     * @return video_pic
     */
    public String getVideoPic() {
        return videoPic;
    }

    /**
     * 设置视频封面
     *
     * @param videoPic
     */
    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic == null ? null : videoPic.trim();
    }

    /**
     * 获取生效时间
     *
     * @return begin_time
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置生效时间
     *
     * @param beginTime
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取失效时间
     *
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置失效时间
     *
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        sb.append(", newsCode=").append(newsCode);
        sb.append(", newsTitle=").append(newsTitle);
        sb.append(", newsDigest=").append(newsDigest);
        sb.append(", newsUrl=").append(newsUrl);
        sb.append(", newsPicUrl=").append(newsPicUrl);
        sb.append(", newsFrom=").append(newsFrom);
        sb.append(", status=").append(status);
        sb.append(", browsingTimes=").append(browsingTimes);
        sb.append(", isTop=").append(isTop);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", videoPic=").append(videoPic);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}