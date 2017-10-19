package com.shfc.nnstv.dto.httpbean.req;

import java.io.Serializable;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/5/22 下午3:40.
 */
public class ImportReqBean implements Serializable {
    private String filePath;//xlsx文件路径

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
