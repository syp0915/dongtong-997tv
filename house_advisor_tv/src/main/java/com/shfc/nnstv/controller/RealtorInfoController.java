package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.RealtorInfoAO;
import com.shfc.nnstv.dto.httpbean.req.RealtorDetailReqBean;
import com.shfc.nnstv.dto.httpbean.req.RealtorListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorDetailRespBean;
import com.shfc.nnstv.dto.httpbean.resp.RealtorListRespBean;
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
 * @date 2017-04-25 17:44
 * version V1.0.0
 **/
@Api(tags = "RealtorInfoController",description = "认证经纪人信息")
@RestController
@RequestMapping("/realtor")
public class RealtorInfoController {

    @Autowired(required = false)
    private RealtorInfoAO realtorInfoAO;

    @ApiOperation(value = "认证经纪人列表", notes = "经纪人列表")
    @RequestMapping(value = "/realtorList/{version}", method = RequestMethod.POST)
    public ResultDO<RealtorListRespBean> getRealtorList(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody RealtorListReqBean realtorListReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return realtorInfoAO.getRealtorList(realtorListReqBean);
    }

    @ApiOperation(value = "认证经纪人详情", notes = "经纪人详情")
    @RequestMapping(value = "/realtorDetail/{version}", method = RequestMethod.POST)
    public ResultDO<RealtorDetailRespBean> getRealtorDetail(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody RealtorDetailReqBean realtorDetailReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return realtorInfoAO.getRealtorDetail(realtorDetailReqBean);
    }
}
