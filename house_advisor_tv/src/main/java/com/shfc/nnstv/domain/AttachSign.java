package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.AttachSign.java
 * @Description: 
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class AttachSign extends BaseBean {
    /**
     * 附件名称
     */
    private String signId;

    /**
     * 附件URL路径
     */
    private String attachid;

    /**
     * 是否删除 0未删除 1已删除
     */
    private Long isDelete;

    /**
     * 获取附件名称
     *
     * @return sign_id
     */
    public String getSignId() {
        return signId;
    }

    /**
     * 设置附件名称
     *
     * @param signId
     */
    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
    }

    /**
     * 获取附件URL路径
     *
     * @return attachid
     */
    public String getAttachid() {
        return attachid;
    }

    /**
     * 设置附件URL路径
     *
     * @param attachid
     */
    public void setAttachid(String attachid) {
        this.attachid = attachid == null ? null : attachid.trim();
    }

    /**
     * 获取是否删除 0未删除 1已删除
     *
     * @return is_delete
     */
    public Long getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0未删除 1已删除
     *
     * @param isDelete
     */
    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
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
        sb.append(", signId=").append(signId);
        sb.append(", attachid=").append(attachid);
        sb.append(", isDelete=").append(isDelete);
        sb.append("]");
        return sb.toString();
    }
}