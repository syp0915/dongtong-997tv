package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.BaseParameter.java
 * @Description: 参数管理表
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class BaseParameter extends BaseBean {
    /**
     * 模块id  0-父模块 >0子模块
     */
    private Long module;

    /**
     * 参数类型值
     */
    private Long type;

    /**
     * 参数类型
     */
    private String typeName;

    /**
     * 参数键名
     */
    private Long key;

    /**
     * 参数值
     */
    private String name;

    /**
     * 0为正常，1为停用
     */
    private Integer status;

    /**
     * 获取模块id  0-父模块 >0子模块
     *
     * @return module
     */
    public Long getModule() {
        return module;
    }

    /**
     * 设置模块id  0-父模块 >0子模块
     *
     * @param module
     */
    public void setModule(Long module) {
        this.module = module;
    }

    /**
     * 获取参数类型值
     *
     * @return type
     */
    public Long getType() {
        return type;
    }

    /**
     * 设置参数类型值
     *
     * @param type
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * 获取参数类型
     *
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置参数类型
     *
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 获取参数键名
     *
     * @return key
     */
    public Long getKey() {
        return key;
    }

    /**
     * 设置参数键名
     *
     * @param key
     */
    public void setKey(Long key) {
        this.key = key;
    }

    /**
     * 获取参数值
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置参数值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取0为正常，1为停用
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0为正常，1为停用
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
        sb.append(", module=").append(module);
        sb.append(", type=").append(type);
        sb.append(", typeName=").append(typeName);
        sb.append(", key=").append(key);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}