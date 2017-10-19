package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.BaseNewsContent.java
 * @Description: 新闻内容
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class BaseNewsContent extends BaseBean {
    private Long newsId;

    private String newsContent;

    /**
     * @return news_id
     */
    public Long getNewsId() {
        return newsId;
    }

    /**
     * @param newsId
     */
    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    /**
     * @return news_content
     */
    public String getNewsContent() {
        return newsContent;
    }

    /**
     * @param newsContent
     */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
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
        sb.append(", newsId=").append(newsId);
        sb.append(", newsContent=").append(newsContent);
        sb.append("]");
        return sb.toString();
    }
}