package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.HouseAO;
import com.shfc.nnstv.dto.httpbean.req.HouseListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.HouseListRespBean;
import com.shfc.nnstv.exception.NNSWebException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/21 下午1:41.
 */

@Api(tags = "HouseController",description = "房源信息")
@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired(required = false)
    private HouseAO houseAO;

    @ApiOperation(value = "房源列表", notes = "房源列表")
    @RequestMapping(value = "/houseList/{version}", method = RequestMethod.POST)
    public ResultDO<HouseListRespBean> houseList(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody HouseListReqBean houseListReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return houseAO.getHouseList(houseListReqBean);
    }
}
