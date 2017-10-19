package com.shfc.nnstv.dto;

import com.shfc.nnstv.domain.RealtorStore;

/**
 * @author sunyaping
 * @Package com.shfc.nnstv.dto
 * @Description
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * @date 2017-08-04 17:43
 * version V1.0.0
 **/
public class RealtorStoreDTO extends RealtorStore {

    /**
     * 对应经纪公司名字
     */
    private String  realtorCompanyName;

    /**
     * 经纪公司图片
     */
    private String realtorCompanyImg;

    public String getRealtorCompanyName() {
        return realtorCompanyName;
    }

    public void setRealtorCompanyName(String realtorCompanyName) {
        this.realtorCompanyName = realtorCompanyName;
    }

    public String getRealtorCompanyImg() {
        return realtorCompanyImg;
    }

    public void setRealtorCompanyImg(String realtorCompanyImg) {
        this.realtorCompanyImg = realtorCompanyImg;
    }
}
