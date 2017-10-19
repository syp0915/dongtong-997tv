package com.shfc.nnstv.service;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 10:44
 **/
public class AdvertisementServiceTest extends JunitBaseMockMvcTest{

    @Autowired
    private AdvertisementService advertisementService;

    @Test
    public void testGetAdvList(){

        ResultDO<List<AdvertisementInfoBean>> resultDO=advertisementService.getAdvList("1");

        System.out.println(resultDO);

    }

}
