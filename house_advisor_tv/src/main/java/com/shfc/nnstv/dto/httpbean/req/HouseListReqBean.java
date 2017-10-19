package com.shfc.nnstv.dto.httpbean.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午5:40.
 */
@ApiModel(value = "HouseListReqBean")
public class HouseListReqBean implements Serializable{

    @ApiModelProperty(value = "机顶盒mac地址",required = true)
    private String mac;

    @ApiModelProperty(value = "是否首页展示", required = false)
    private Integer isIndex = 1;

    @ApiModelProperty(value = "每页记录数", required = true)
    private Integer pageSize = 10;

    @ApiModelProperty(value = "目标页码", required = true)
    private Integer pageNumber = 1;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Integer getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(Integer isIndex) {
        this.isIndex = isIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
