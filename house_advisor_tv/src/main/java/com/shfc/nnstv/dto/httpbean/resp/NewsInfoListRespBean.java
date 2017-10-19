package com.shfc.nnstv.dto.httpbean.resp;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;

import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 09:27
 **/
public class NewsInfoListRespBean extends HttpBaseBean {
    private List<NewsInfoBean> list;

    public List<NewsInfoBean> getList() {
        return list;
    }

    public void setList(List<NewsInfoBean> list) {
        this.list = list;
    }
}
