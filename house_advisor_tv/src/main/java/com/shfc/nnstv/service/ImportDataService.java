package com.shfc.nnstv.service;

import com.shfc.common.result.ResultDO;

import java.io.IOException;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/5/19 下午1:56.
 */
public interface ImportDataService {

    public ResultDO inportRealtorData(String filePath) throws IOException;

}
