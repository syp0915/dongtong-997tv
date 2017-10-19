package com.shfc.nnstv.dto.httpbean;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/26 上午11:05.
 */
public class CommonRespBean<T> {
    private String timestamp;
    private String respJson;
    private String signature;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRespJson() {
        return respJson;
    }

    public void setRespJson(String respJson) {
        this.respJson = respJson;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
