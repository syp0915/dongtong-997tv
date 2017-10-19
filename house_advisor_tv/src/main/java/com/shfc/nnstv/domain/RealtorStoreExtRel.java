package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.RealtorStoreExtRel.java
 * @Description: 经纪人门店扩展关系表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class RealtorStoreExtRel extends BaseBean {
    /**
     * 门店id
     */
    private Long storeId;

    /**
     * 关系类型 0-区域 1-板块 2-小区
     */
    private Integer relType;

    /**
     * 关联关系id
     */
    private Long relId;

    /**
     * 关联状态 0-正常 1-删除
     */
    private Integer status;

    /**
     * 获取门店id
     *
     * @return store_id
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * 设置门店id
     *
     * @param storeId
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /**
     * 获取关系类型 0-区域 1-板块 2-小区
     *
     * @return rel_type
     */
    public Integer getRelType() {
        return relType;
    }

    /**
     * 设置关系类型 0-区域 1-板块 2-小区
     *
     * @param relType
     */
    public void setRelType(Integer relType) {
        this.relType = relType;
    }

    /**
     * 获取关联关系id
     *
     * @return rel_id
     */
    public Long getRelId() {
        return relId;
    }

    /**
     * 设置关联关系id
     *
     * @param relId
     */
    public void setRelId(Long relId) {
        this.relId = relId;
    }

    /**
     * 获取关联状态 0-正常 1-删除
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置关联状态 0-正常 1-删除
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
        sb.append(", storeId=").append(storeId);
        sb.append(", relType=").append(relType);
        sb.append(", relId=").append(relId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}