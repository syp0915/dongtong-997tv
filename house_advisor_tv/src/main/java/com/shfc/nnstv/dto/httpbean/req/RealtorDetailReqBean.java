package com.shfc.nnstv.dto.httpbean.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.dto.httpbean.req
 * @Description 经纪人详情入参
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 9:56
 * version V1.0.0
 **/
@ApiModel(value = "RealtorDetailReqBean")
public class RealtorDetailReqBean {

    @ApiModelProperty(value = "经纪人Id",required = true)
    private String realtorId;

    @ApiModelProperty(value = "机顶盒mac地址",required = true)
    private String mac;


    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getRealtorId() {
        return realtorId;
    }

    public void setRealtorId(String realtorId) {
        this.realtorId = realtorId;
    }
}
