package com.shfc.nnstv.service;

import com.shfc.nnstv.JunitBaseMockMvcTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/5/19 下午4:02.
 */
public class ImportDataServiceTest extends JunitBaseMockMvcTest {

    @Autowired(required = false)
    private ImportDataService importDataService;

    @Test
    public void testImportCompanyData(){
        try {
            importDataService.inportRealtorData("/Users/ljgllxyz/develop/Repository/Demo/realtor_info.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
