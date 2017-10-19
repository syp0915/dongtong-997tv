package com.shfc.nnstv.service.impl;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dao.PlotMapper;
import com.shfc.nnstv.dao.RealtorCompanyMapper;
import com.shfc.nnstv.dao.RealtorStoreExtRelMapper;
import com.shfc.nnstv.dao.RealtorStoreMapper;
import com.shfc.nnstv.domain.Plot;
import com.shfc.nnstv.domain.RealtorCompany;
import com.shfc.nnstv.domain.RealtorStore;
import com.shfc.nnstv.domain.RealtorStoreExtRel;
import com.shfc.nnstv.service.ImportDataService;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/5/19 下午1:55.
 */
@Service
public class ImportDataServiceImpl implements ImportDataService {

    @Autowired(required = false)
    private RealtorCompanyMapper realtorCompanyMapper;

    @Autowired(required = false)
    private RealtorStoreMapper realtorStoreMapper;

    @Autowired(required = false)
    private PlotMapper plotMapper;

    @Autowired(required = false)
    private RealtorStoreExtRelMapper realtorStoreExtRelMapper;

    @Transactional
    public ResultDO inportRealtorData(String filePath) throws IOException {
        ResultDO resultDO = new ResultDO();
        try {
            File file = new File(filePath);
            FileInputStream inputStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int rowNumber = sheet.getLastRowNum();
            Integer codeNum = 10000;
            for (int i = 1; i < rowNumber; i++) {
                String companyName = sheet.getRow(i).getCell(0).getStringCellValue();
                String shopName = sheet.getRow(i).getCell(1).getStringCellValue();
                String plotName = sheet.getRow(i).getCell(2).getStringCellValue();
                RealtorCompany realtorCompany = null;
                if (!ValidateHelper.isEmpty(companyName)){
                    realtorCompany = realtorCompanyMapper.findCompanyByName(companyName);
                    if (realtorCompany == null){
                        realtorCompany = new RealtorCompany();
                        realtorCompany.setComName(companyName);
                        realtorCompany.setComAbbr(companyName);
                        realtorCompany.setComStatus(0);
                        realtorCompanyMapper.insert(realtorCompany);
                    }
                }
                RealtorStore realtorStore = null;
                if (ValidateHelper.isEmpty(shopName)){
                    shopName = companyName;
                }
                realtorStore = realtorStoreMapper.findStoreByName(shopName);
                if (realtorStore == null){
                    realtorStore = new RealtorStore();
                    realtorStore.setStoreName(shopName);
                    realtorStore.setRealtorCompanyId(realtorCompany.getId());
                    realtorStore.setStoreStatus(0);
                    realtorStore.setStoreCode("SH" + ++codeNum);
                    realtorStoreMapper.insert(realtorStore);
                }
                Plot plot = null;
                RealtorStoreExtRel realtorStoreExtRel = new RealtorStoreExtRel();
                if (!ValidateHelper.isEmpty(plotName)){
                    plot = plotMapper.findPlotByName(plotName);
                    if (plot == null){
                        plot = new Plot();
                        plot.setPlotName(plotName);
                        plot.setPlotAlias(plotName);
                        plot.setPlotStatus(0);
                        plot.setCityId(310000L);
                        plotMapper.insert(plot);
                    }

                    realtorStoreExtRel.setRelType(2);
                    realtorStoreExtRel.setRelId(plot.getId());
                    realtorStoreExtRel.setStatus(0);
                    realtorStoreExtRel.setStoreId(realtorStore.getId());
                    realtorStoreExtRelMapper.insert(realtorStoreExtRel);
                }
            }
            resultDO.setSuccess(true);
            resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
            resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
            return resultDO;
        } catch (IOException e) {
            e.printStackTrace();
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.IMPORT_EXCEPTION.getCode());
            resultDO.setErrMsg(e.getMessage());
            return resultDO;
        }
    }
}
