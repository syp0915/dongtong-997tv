package com.shfc.nnstv.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Package com.shfc.nnstv.interceptors.NNSWebInterceptor
 * @Description: NNSWebInterceptor
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/3/15 8:53
 * version V1.0.0
 */
public class NNSWebInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return true;
    }
}
