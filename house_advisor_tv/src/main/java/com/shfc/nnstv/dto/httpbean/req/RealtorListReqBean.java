package com.shfc.nnstv.dto.httpbean.req;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.dto.httpbean.req
 * @Description 认证经纪人列表请求入参
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 9:48
 * version V1.0.0
 **/
@ApiModel(value = "RealtorListReqBean")
public class RealtorListReqBean extends HttpBaseBean{

    @ApiModelProperty(value = "机顶盒mac地址",required = true)
    private String mac;

    @ApiModelProperty(value = "是否首页展示", required = true)
    private Integer displayPosition = 1;


    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Integer getDisplayPosition() {
        return displayPosition;
    }

    public void setDisplayPosition(Integer displayPosition) {
        this.displayPosition = displayPosition;
    }
}
