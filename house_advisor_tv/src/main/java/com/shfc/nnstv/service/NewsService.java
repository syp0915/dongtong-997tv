package com.shfc.nnstv.service;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsInfoListRespBean;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午2:34.
 */
public interface NewsService {

    ResultDO<NewsInfoListRespBean> newsList(Integer pageNumber, Integer pageSize);

    ResultDO<NewsContentRespBean> queryNewsContent(String informId);

}
