package com.shfc.nnstv.utils;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/25 下午6:11.
 */
public class JGApacheHttpClient {
    private static final String ENCODING = "UTF-8";
    private static Logger logger = Logger.getLogger(JGApacheHttpClient.class);

    public JGApacheHttpClient() {
    }

    public static String doPost(String url, Map<String, Object> params, Map<String, String> headers) throws ClientProtocolException, IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        ArrayList list = new ArrayList();
//        if(params != null) {
//            Iterator response = params.keySet().iterator();
//
//            while(response.hasNext()) {
//                String temp = (String)response.next();
//                list.add(new BasicNameValuePair(temp, (String)params.get(temp)));
//            }
//        }

        if(headers != null) {
            Iterator iterator = headers.keySet().iterator();

            while(iterator.hasNext()) {
                String key = (String)iterator.next();
                post.setHeader(key, headers.get(key));
            }
        }

        //post.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
        if (params != null){
            logger.info("reqJson------>" + JSON.toJSONString(params));
            post.setEntity(new StringEntity(JSON.toJSONString(params), "utf-8"));
        }
        CloseableHttpResponse response1 = client.execute(post);
        return new String(EntityUtils.toByteArray(response1.getEntity()), "UTF-8");
    }

    public static String doGet(String url) throws IOException, ClientProtocolException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
        StringBuffer content = new StringBuffer();
        String buffer = null;

        while((buffer = reader.readLine()) != null) {
            content.append(buffer);
        }

        get.abort();
        return content.toString();
    }
}
