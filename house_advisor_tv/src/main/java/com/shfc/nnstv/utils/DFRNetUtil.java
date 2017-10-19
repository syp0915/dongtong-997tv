package com.shfc.nnstv.utils;

import com.alibaba.fastjson.JSON;
import com.shfc.common.encrypt.AESUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 * 东方云统一请求，统一做加签
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 上午10:35.
 */
@Service
public class DFRNetUtil {
    private static Logger logger = Logger.getLogger(DFRNetUtil.class);

    @Value("${dfr.request.base.url}")
    private String baseUrl;

    @Value("${dfr.merchant.access.key}")
    private String accessKey;

    @Value("${dfr.merchant.encrypt.key}")
    private String encryptKey;

    @Value("${dfr.merchant.id}")
    private Long merchantId;

    @Value("${dfr.merchant.channel.no}")
    private String channelNo;

    /**
     * 通过机顶盒macn地址等信息获取更多机顶盒信息
     * @param mac
     * @return
     */
    public String doQueryTVBoxInfo(String mac){
        String url = "/cloud/mac/macDetail/v1.0.0";
        Map<String, Object> businessParams = new HashMap<String, Object>();
        businessParams.put("mac", mac);
        businessParams.put("channelNo", channelNo);
        businessParams.put("merchantId", merchantId);
        return requestDFR(url, businessParams);
    }


    /**
     * 统一封装参数，向东方云发起请求
     * @param url
     * @param businessParams
     * @return
     */
    private String requestDFR(String url, Map<String, Object> businessParams){
        url = baseUrl + url;
        String reqJson = JSON.toJSONString(businessParams);
        Long timeStamp = System.currentTimeMillis();
        String signature = generateSignature(reqJson, timeStamp);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("apiKey", accessKey);
        params.put("reqJson", businessParams);
        params.put("signature", signature);
        params.put("timestamp", timeStamp + "");

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        try {
            return  JGApacheHttpClient.doPost(url, params, headers);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("东方云接口网络请求异常：" + e.getMessage());
        }
        return null;
    }

    /**
     * 生成业务签名
     * @param reqJson
     * @return
     */
    private String generateSignature(String reqJson, Long timeStamp){
        try {
            return AESUtils.encrypt(reqJson, encryptKey, timeStamp + "");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("请求加签失败：" + e.getMessage());
        }
        return null;
    }


}
