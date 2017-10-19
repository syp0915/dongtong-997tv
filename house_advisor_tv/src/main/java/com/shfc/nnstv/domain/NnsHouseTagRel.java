package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.NnsHouseTagRel.java
 * @Description: 置业顾问房源标签关系表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class NnsHouseTagRel extends BaseBean {
    /**
     * 房源id
     */
    private Long nnsHouseId;

    /**
     * 标签id
     */
    private Long tagId;

    /**
     * 获取房源id
     *
     * @return nns_house_id
     */
    public Long getNnsHouseId() {
        return nnsHouseId;
    }

    /**
     * 设置房源id
     *
     * @param nnsHouseId
     */
    public void setNnsHouseId(Long nnsHouseId) {
        this.nnsHouseId = nnsHouseId;
    }

    /**
     * 获取标签id
     *
     * @return tag_id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置标签id
     *
     * @param tagId
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
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
        sb.append(", nnsHouseId=").append(nnsHouseId);
        sb.append(", tagId=").append(tagId);
        sb.append("]");
        return sb.toString();
    }
}