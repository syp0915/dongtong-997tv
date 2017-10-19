package com.shfc.nnstv.service;

import com.alibaba.fastjson.JSON;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.resp.HouseListRespBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/21 下午1:41.
 */
public class HouseServiceTest extends JunitBaseMockMvcTest {

    @Autowired(required = false)
    private HouseService houseService;

    @Test
    public void testGetHouseList(){
        ResultDO<HouseListRespBean> resultDO = houseService.getHouseList("0019684375FB", 10, 1);
        System.out.println(JSON.toJSONString(resultDO));
    }
}
