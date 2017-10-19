package com.shfc.nnstv.service;

import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.utils.DFRNetUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/6/20 下午3:41.
 */
public class DFRUtilTest extends JunitBaseMockMvcTest{

    @Autowired(required = false)
    private DFRNetUtil dfrNetUtil;

    @Test
    public void testRequestDFR(){
        //String result = dfrNetUtil.doQueryTVBoxInfo("0019684375FB");
        String result = dfrNetUtil.doQueryTVBoxInfo("98bc576855c5");
        System.out.println("result------->" + result);
    }
}
