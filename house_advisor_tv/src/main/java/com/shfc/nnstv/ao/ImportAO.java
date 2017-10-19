package com.shfc.nnstv.ao;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.req.ImportReqBean;
import com.shfc.nnstv.service.ImportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/5/22 下午3:33.
 */
@Service
public class ImportAO {

    @Autowired(required = false)
    private ImportDataService importDataService;

    public ResultDO importAjkData(ImportReqBean importReqBean) {
        ResultDO resultDO = new ResultDO();
        String filePath = importReqBean.getFilePath();
        if (ValidateHelper.isEmpty(filePath)){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        File file = new File(filePath);
        if (!file.exists()){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.INVALID_FILE_PATH.getCode());
            resultDO.setErrMsg(ErrorConstant.INVALID_FILE_PATH.getMsg());
            return resultDO;
        }
        try {
            return importDataService.inportRealtorData(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.IMPORT_EXCEPTION.getCode());
            resultDO.setErrMsg(ErrorConstant.IMPORT_EXCEPTION.getMsg());
            return resultDO;
        }
    }
}
