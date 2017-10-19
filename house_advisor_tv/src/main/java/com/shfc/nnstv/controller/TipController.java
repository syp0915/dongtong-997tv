package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.TipAO;
import com.shfc.nnstv.dto.httpbean.req.TipsListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.TipInfoListRespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 10:36
 **/
@Api(tags = "TipController",description = "交易小贴士")
@RestController
@RequestMapping("/tips")
public class TipController {
    @Autowired(required = false)
    private TipAO tipAO;

    @ApiOperation(value = "交易小贴士列表",notes ="交易小贴士列表" )
    @RequestMapping(value = "/tipList/{version}",method = RequestMethod.POST)
    public ResultDO<TipInfoListRespBean> tipList(
            @ApiParam(name="reqJson",value = "请求参数",required = true) @RequestBody TipsListReqBean tipsListReqBean,
            @ApiParam(name="version",value = "版本号",required = true,defaultValue = "v1.0.0")@PathVariable("version") String version){

        return tipAO.tipList(tipsListReqBean);
    }


}
