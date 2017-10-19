package com.shfc.nnstv.manager;

import com.shfc.nnstv.dao.BaseAdvertisementMapper;
import com.shfc.nnstv.dto.httpbean.resp.AdvertisementInfoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 09:43
 **/
@Service
public class AdvertisementManager {
    @Autowired(required = false)
    private BaseAdvertisementMapper advertisementMapper;

    /**
     * 根据页面表示获取广告信息
     * @param page
     * @return
     */
    public List<AdvertisementInfoBean> queryAdv(String page){

        return advertisementMapper.advList(page);

    }



}
