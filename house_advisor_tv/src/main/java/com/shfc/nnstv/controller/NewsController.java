package com.shfc.nnstv.controller;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.ao.NewsAO;
import com.shfc.nnstv.dto.httpbean.req.NewsContenrReqBean;
import com.shfc.nnstv.dto.httpbean.req.NewsListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsInfoListRespBean;
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
 * @author wuky
 * @version V1.0
 * @date 2017/4/21 下午1:41.
 */

@Api(tags = "NewsController",description = "新闻信息")
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired(required = false)
    private NewsAO newsAO;

    @ApiOperation(value = "新闻列表", notes = "新闻列表")
    @RequestMapping(value = "/newsList/{version}", method = RequestMethod.POST)
    public ResultDO<NewsInfoListRespBean> newsList(
            @ApiParam(name="reqJson",value="请求参数", required=true)@RequestBody NewsListReqBean newsListReqBean,
            @ApiParam(name="version",value="版本号", required=true, defaultValue ="v1.0.0" )@PathVariable("version") String version)throws NNSWebException {
        return newsAO.newsList(newsListReqBean);
    }

    @ApiOperation(value = "新闻详情",notes = "新闻详情")
    @RequestMapping(value = "/newsDetail/{version}",method = RequestMethod.POST)
    public ResultDO<NewsContentRespBean> newsDetail(
            @ApiParam(name = "reqJson",value = "请求参数",required = true)@RequestBody NewsContenrReqBean reqJson,
            @ApiParam(name = "version",value = "版本号",required = true,defaultValue = "v1.0.0")@PathVariable("version")String version){

        return newsAO.queryNewsContent(reqJson);
    }
}
