package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.MechanismAO;
import com.shfc.nnstv.dto.httpbean.req.MechanismListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismCountRespBean;
import com.shfc.nnstv.dto.httpbean.resp.MechanismListRespBean;
import com.shfc.nnstv.exception.NNSWebException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.controller
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-04-25 17:37
 * version V1.0.0
 **/
@Api(tags = "MechanismController",description = "认证机构信息")
@RestController
@RequestMapping("/mechanism")
public class MechanismController {

    @Autowired(required = false)
    private MechanismAO mechanismAO;

    @ApiOperation(value = "认证机构列表", notes = "机构列表")
    @RequestMapping(value = "/mechanismList/{version}", method = RequestMethod.POST)
    public ResultDO<MechanismListRespBean> getMechanisList(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody MechanismListReqBean mechanismListReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return mechanismAO.getMechanismList(mechanismListReqBean);
    }

    @ApiOperation(value = "认证机构统计", notes = "认证机构统计")
    @RequestMapping(value = "/mechanismTotal/{version}", method = RequestMethod.POST)
    public ResultDO<MechanismCountRespBean> getMechanismTotal(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody MechanismListReqBean mechanismListReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return mechanismAO.getMechanismCount(mechanismListReqBean);
    }
}
