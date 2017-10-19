package com.shfc.nnstv.service;

import com.alibaba.fastjson.JSON;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.JunitBaseMockMvcTest;
import com.shfc.nnstv.domain.RealtorCompany;
import com.shfc.nnstv.domain.RealtorStore;
import com.shfc.nnstv.dto.httpbean.resp.MechanismBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismCountRespBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismListRespBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorListRespBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.service
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 15:21
 * version V1.0.0
 **/
public class MechanismServiceTest extends JunitBaseMockMvcTest {
    @Autowired
    private MechanismService mechanismService;

    @Test
    public void testMechanismCount() {
        ResultDO<MechanismCountRespBean> resultDO= mechanismService.getMechanismCount("0019684375FB");
        System.out.println(JSON.toJSON(resultDO));
    }

    @Test
    public void testMechanismList() {
        ResultDO<MechanismListRespBean> resultDO= mechanismService.getMechanismList("98bc5705f8a0",10,1);
        System.out.println(JSON.toJSON(resultDO));
    }
}
