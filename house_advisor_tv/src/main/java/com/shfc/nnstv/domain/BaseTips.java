package com.shfc.nnstv.domain;

import com.shfc.common.httpbean.BaseBean;

/**
 * @Package: com.shfc.nnstv.domain.BaseTips.java
 * @Description: 交易小贴士
 * @Company: 上海房产
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author sun ya ping
 * @date 2017/08/03 10:04
 * version v1.0.0
 */
public class BaseTips extends BaseBean {
    /**
     * 问题
     */
    private String question;

    /**
     * 类型 1默认
     */
    private Boolean type;

    /**
     * 权重
     */
    private Short rank;

    /**
     * 状态：1正常 2已删除
     */
    private Boolean status;

    /**
     * 回答
     */
    private String answer;

    /**
     * 获取问题
     *
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置问题
     *
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * 获取类型 1默认
     *
     * @return type
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置类型 1默认
     *
     * @param type
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取权重
     *
     * @return rank
     */
    public Short getRank() {
        return rank;
    }

    /**
     * 设置权重
     *
     * @param rank
     */
    public void setRank(Short rank) {
        this.rank = rank;
    }

    /**
     * 获取状态：1正常 2已删除
     *
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态：1正常 2已删除
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取回答
     *
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置回答
     *
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}