package com.shfc.nnstv.dto.httpbean.resp;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-24 09:36
 **/
public class AdvertisementInfoBean implements Serializable {
    private String adUrl;
    private String toUrl;
    private Integer type;
    private String videoPic;

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVideoPic() {
        return videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic;
    }
}
