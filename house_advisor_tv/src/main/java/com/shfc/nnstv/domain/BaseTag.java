package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.BaseTag.java
 * @Description: 标签
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class BaseTag extends BaseBean {
    private String tagName;

    /**
     * 标签颜色
     */
    private String tagColor;

    /**
     * 1新房标签2二手房标签3资讯标签4经纪人客户5经纪人评价标签6房源纠错标签
     */
    private Integer tagType;

    /**
     * 0-基础 1-自定义
     */
    private Integer level;

    /**
     * 客户类型  1-买家 2-卖家  12-买卖家共有，目前只针对经纪人客户标签有限制
     */
    private Integer source;

    /**
     * 取自base_tag_category表的Id
     */
    private Integer category;

    /**
     * 标签状态：0-正常，1-停用
     */
    private Integer status;

    /**
     * @return tag_name
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * 获取标签颜色
     *
     * @return tag_color
     */
    public String getTagColor() {
        return tagColor;
    }

    /**
     * 设置标签颜色
     *
     * @param tagColor
     */
    public void setTagColor(String tagColor) {
        this.tagColor = tagColor == null ? null : tagColor.trim();
    }

    /**
     * 获取1新房标签2二手房标签3资讯标签4经纪人客户5经纪人评价标签6房源纠错标签
     *
     * @return tag_type
     */
    public Integer getTagType() {
        return tagType;
    }

    /**
     * 设置1新房标签2二手房标签3资讯标签4经纪人客户5经纪人评价标签6房源纠错标签
     *
     * @param tagType
     */
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    /**
     * 获取0-基础 1-自定义
     *
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置0-基础 1-自定义
     *
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取客户类型  1-买家 2-卖家  12-买卖家共有，目前只针对经纪人客户标签有限制
     *
     * @return source
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置客户类型  1-买家 2-卖家  12-买卖家共有，目前只针对经纪人客户标签有限制
     *
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取取自base_tag_category表的Id
     *
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置取自base_tag_category表的Id
     *
     * @param category
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 获取标签状态：0-正常，1-停用
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置标签状态：0-正常，1-停用
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
        sb.append(", tagName=").append(tagName);
        sb.append(", tagColor=").append(tagColor);
        sb.append(", tagType=").append(tagType);
        sb.append(", level=").append(level);
        sb.append(", source=").append(source);
        sb.append(", category=").append(category);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}