package com.shfc.nnstv.service;

import com.shfc.common.result.ResultDO;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;

import java.util.List;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午2:34.
 */
public interface AdvertisementService {

    ResultDO<List<AdvertisementInfoBean>> getAdvList(String page);
}
