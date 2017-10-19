package com.shfc.nnstv.service;

import com.alibaba.fastjson.JSON;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.dto.httpbean.resp.RealtorDetailRespBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorListRespBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author sunyaping
 * @Package com.shfc.nnstv.service
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 15:21
 * version V1.0.0
 **/
public class RealtorServiceTest extends JunitBaseMockMvcTest {
    @Autowired
    private RealtorInfoService realtorInfoService;

    @Test
    public void testRealtorListByHomePage() {
        ResultDO<RealtorListRespBean> resultDO= realtorInfoService.getRealtorListByHomePage();
        System.out.println(JSON.toJSON(resultDO));
    }

    @Test
    public void  testRealtorList() {
        ResultDO<RealtorListRespBean> resultDO= realtorInfoService.getRealtorList("0019684375FB",10,1);
        System.out.println(JSON.toJSON(resultDO));
    }


    @Test
    public void testDetailById() {
        ResultDO<RealtorDetailRespBean> resultDO= realtorInfoService.selectDetailById(9L,"0019684375FB");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(JSON.toJSON(resultDO.getData()));
    }
}
