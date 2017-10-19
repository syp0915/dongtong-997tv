package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.ImportAO;
import com.shfc.nnstv.dto.httpbean.req.ImportReqBean;
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
 * @date 2017/5/22 下午3:31.
 */
@Api(tags = "ImportController",description = "数据导入")
@RestController
@RequestMapping("/import")
public class ImportController {

    @Autowired(required = false)
    private ImportAO importAO;

    @ApiOperation(value = "数据导入", notes = "数据导入")
    @RequestMapping(value = "/ajk/{version}", method = RequestMethod.POST)
    public ResultDO importAjkData(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody ImportReqBean importReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return importAO.importAjkData(importReqBean);
    }
}
