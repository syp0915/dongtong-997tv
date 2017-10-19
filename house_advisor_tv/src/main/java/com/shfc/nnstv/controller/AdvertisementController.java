package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.AdvertisementAO;
import com.shfc.nnstv.dto.httpbean.req.AdvListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 10:56
 **/
@Api(tags = "AdvertisementController",description = "广告信息")
@RestController
@RequestMapping("/adv")
public class AdvertisementController {
    @Autowired(required = false)
    private AdvertisementAO advertisementAO;

    @ApiOperation(value = "TV端广告信息",notes = "TV端广告信息")
    @RequestMapping(value = "/advList/{version}",method = RequestMethod.POST)
    public ResultDO<List<AdvertisementInfoBean>> advList(
            @ApiParam(name = "reqJson",value = "请求参数",required = true)@RequestBody AdvListReqBean reqJson,
            @ApiParam(name = "version",value = "版本号",required = true,defaultValue = "v1.0.0")@PathVariable("version")String version){
        return advertisementAO.getAdvList(reqJson);
    }
}
