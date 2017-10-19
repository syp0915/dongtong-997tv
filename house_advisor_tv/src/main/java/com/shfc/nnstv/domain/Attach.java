package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.Attach.java
 * @Description: 
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class Attach extends BaseBean {
    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 附件URL路径
     */
    private String attachUrl;

    /**
     * 附件类型
     */
    private String attachType;

    /**
     * FastDFS附件名称
     */
    private String fastdfsName;

    /**
     * 是否删除 0未删除 1已删除
     */
    private Long isDelete;

    /**
     * 获取附件名称
     *
     * @return attach_name
     */
    public String getAttachName() {
        return attachName;
    }

    /**
     * 设置附件名称
     *
     * @param attachName
     */
    public void setAttachName(String attachName) {
        this.attachName = attachName == null ? null : attachName.trim();
    }

    /**
     * 获取附件URL路径
     *
     * @return attach_url
     */
    public String getAttachUrl() {
        return attachUrl;
    }

    /**
     * 设置附件URL路径
     *
     * @param attachUrl
     */
    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl == null ? null : attachUrl.trim();
    }

    /**
     * 获取附件类型
     *
     * @return attach_type
     */
    public String getAttachType() {
        return attachType;
    }

    /**
     * 设置附件类型
     *
     * @param attachType
     */
    public void setAttachType(String attachType) {
        this.attachType = attachType == null ? null : attachType.trim();
    }

    /**
     * 获取FastDFS附件名称
     *
     * @return fastdfs_name
     */
    public String getFastdfsName() {
        return fastdfsName;
    }

    /**
     * 设置FastDFS附件名称
     *
     * @param fastdfsName
     */
    public void setFastdfsName(String fastdfsName) {
        this.fastdfsName = fastdfsName == null ? null : fastdfsName.trim();
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
        sb.append(", attachName=").append(attachName);
        sb.append(", attachUrl=").append(attachUrl);
        sb.append(", attachType=").append(attachType);
        sb.append(", fastdfsName=").append(fastdfsName);
        sb.append(", isDelete=").append(isDelete);
        sb.append("]");
        return sb.toString();
    }
}