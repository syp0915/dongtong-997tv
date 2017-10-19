package com.shfc.nnstv.dto.httpbean.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 13:59
 **/
@ApiModel(value = "NewsContenrReqBean")
public class NewsContenrReqBean  {
    @ApiModelProperty(value = "资讯id",required = true)
    private String informId;

    public String getInformId() {
        return informId;
    }

    public void setInformId(String informId) {
        this.informId = informId;
    }
}
