package com.shfc.nnstv.dto.httpbean.resp;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;

import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 15:50
 **/
public class TipInfoListRespBean extends HttpBaseBean {

    private List<TipInfoBean> list;

    public List<TipInfoBean> getList() {
        return list;
    }

    public void setList(List<TipInfoBean> list) {
        this.list = list;
    }
}
