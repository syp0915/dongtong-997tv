package com.shfc.nnstv.dto.httpbean.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 10:51
 **/
@ApiModel(value = "AdvListReqBean")
public class AdvListReqBean{
    @ApiModelProperty(value = "页面",required = true)
    private String page;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
