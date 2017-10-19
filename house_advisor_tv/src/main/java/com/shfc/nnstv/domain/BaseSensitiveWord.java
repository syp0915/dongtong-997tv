package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.BaseSensitiveWord.java
 * @Description: 敏感词
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author Jianguo Li
 * @date 2017/04/20 14:04
 * version v1.0.0
 */
public class BaseSensitiveWord extends BaseBean {
    /**
     * 敏感词
     */
    private String sensitiveWord;

    /**
     * 敏感词类型
     */
    private Integer type;

    /**
     * 获取敏感词
     *
     * @return sensitive_word
     */
    public String getSensitiveWord() {
        return sensitiveWord;
    }

    /**
     * 设置敏感词
     *
     * @param sensitiveWord
     */
    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord == null ? null : sensitiveWord.trim();
    }

    /**
     * 获取敏感词类型
     *
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置敏感词类型
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", sensitiveWord=").append(sensitiveWord);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}