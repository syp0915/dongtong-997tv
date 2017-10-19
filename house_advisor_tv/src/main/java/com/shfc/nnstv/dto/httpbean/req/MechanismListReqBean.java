package com.shfc.nnstv.dto.httpbean.req;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.dto.httpbean.req
 * @Description:认证机构列表请求参数
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-24 9:40
 * version V1.0.0
 **/
@ApiModel(value = "MechanismListReqBean")
public class MechanismListReqBean extends HttpBaseBean {

    @ApiModelProperty(value = "机顶盒mac地址",required = true)
    private String mac;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
