package com.shfc.nnstv.dto.httpbean.resp;

import com.shfc.nnstv.dto.httpbean.HttpBaseBean;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午7:32.
 */
public class HouseListRespBean extends HttpBaseBean implements Serializable{

    private List<HouseInfoBean> houseList;

    public List<HouseInfoBean> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<HouseInfoBean> houseList) {
        this.houseList = houseList;
    }
}
