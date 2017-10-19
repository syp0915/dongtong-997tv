package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.BaseTagCategory.java
 * @Description: 标签细分
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class BaseTagCategory extends BaseBean {
    /**
     * 标签类型：1:新房标签、2:二手房标签、3：资讯标签，4:经纪人客户、5:经纪人评价标签、6:房源纠错标签
     */
    private Long tagType;

    private String categoryName;

    /**
     * 来源：0-基础 1-自定义
     */
    private String level;

    /**
     * 获取标签类型：1:新房标签、2:二手房标签、3：资讯标签，4:经纪人客户、5:经纪人评价标签、6:房源纠错标签
     *
     * @return tag_type
     */
    public Long getTagType() {
        return tagType;
    }

    /**
     * 设置标签类型：1:新房标签、2:二手房标签、3：资讯标签，4:经纪人客户、5:经纪人评价标签、6:房源纠错标签
     *
     * @param tagType
     */
    public void setTagType(Long tagType) {
        this.tagType = tagType;
    }

    /**
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 获取来源：0-基础 1-自定义
     *
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置来源：0-基础 1-自定义
     *
     * @param level
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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
        sb.append(", tagType=").append(tagType);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", level=").append(level);
        sb.append("]");
        return sb.toString();
    }
}