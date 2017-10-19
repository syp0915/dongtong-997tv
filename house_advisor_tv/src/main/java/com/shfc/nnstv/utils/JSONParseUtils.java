package com.shfc.nnstv.utils;

import com.alibaba.fastjson.JSON;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.exception.NNSWebException;

/**
 * @Package com.shfc.nnstv.utils.JSONParseUtils
 * @Description: JSONParseUtils
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/3/30 20:02
 * version V1.0.0
 */
public class JSONParseUtils {
    public static <T> T parseJavaObject(String jsonStr, Class<T> clazz) throws NNSWebException {
        try {
            return JSON.parseObject(jsonStr, clazz);
        }catch (Exception e){
            throw new NNSWebException(ErrorConstant.ERROR_REQ_JSON.getCode(),
                    ErrorConstant.ERROR_REQ_JSON.getMsg());
        }
    }
}
