package com.shfc.nnstv.ao;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.req.NewsContenrReqBean;
import com.shfc.nnstv.dto.httpbean.req.NewsListReqBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsInfoListRespBean;
import com.shfc.nnstv.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author wuky
 * @version V1.0
 * @date 2017/4/21 下午1:41.
 */
@Service
public class NewsAO {

    @Autowired(required = false)
    private NewsService newsService;

    public ResultDO<NewsInfoListRespBean> newsList(NewsListReqBean newsListReqBean){
        ResultDO<NewsInfoListRespBean> resultDO = new ResultDO<NewsInfoListRespBean>();
        Integer pageSize = newsListReqBean.getPageSize();
        Integer pageNumber = newsListReqBean.getPageNumber();

        return newsService.newsList(pageNumber,pageSize);
    }

    public ResultDO<NewsContentRespBean> queryNewsContent(NewsContenrReqBean reqBean){
        if(ValidateHelper.isEmpty(reqBean.getInformId())){
            ResultDO<NewsContentRespBean> resultDO=new ResultDO<>();
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        return newsService.queryNewsContent(reqBean.getInformId());
    }

}
