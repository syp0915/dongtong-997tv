package com.shfc.nnstv.service.impl;

import com.alibaba.fastjson.JSON;
import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.domain.BaseTag;
import com.shfc.nnstv.dto.TVBoxDTO;
import com.shfc.nnstv.dto.TagDTO;
import com.shfc.nnstv.dto.httpbean.resp.HouseInfoBean;
import com.shfc.nnstv.dto.httpbean.resp.HouseListRespBean;
import com.shfc.nnstv.manager.HouseManager;
import com.shfc.nnstv.service.HouseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午2:33.
 */
@Service
public class HouseServiceImpl extends BaseServiceImpl implements HouseService{

    private static Logger logger =Logger.getLogger(HouseServiceImpl.class);

    @Autowired(required = false)
    private HouseManager houseManager;

    @Override
    public ResultDO<HouseListRespBean> getHouseList(String mac, Integer pageSize, Integer pageNumber) {
        ResultDO<HouseListRespBean> resultDO = new ResultDO<HouseListRespBean>();
        HouseListRespBean houseListRespBean = new HouseListRespBean();
        ResultDO<TVBoxDTO> tvInfo = houseManager.getTVBoxInfoByCondition(mac);
        logger.info("[remote]tvbox info is--------------------->" + JSON.toJSON(tvInfo));
        Double longitude =0.00;
        Double latitude=0.00;
        if(tvInfo!=null && tvInfo.getData()!=null){
            longitude = tvInfo.getData().getLon();
            latitude = tvInfo.getData().getLat();
        }
        Page<HashMap<String, Object>> page = houseManager.getHouseListByCondition(latitude, longitude, pageSize, pageNumber);
        List<HashMap<String, Object>> list = page.getData();
        if (list != null && list.size() > 0){
            List<HouseInfoBean> houseList = new ArrayList<HouseInfoBean>();
            for (HashMap<String, Object> map : list) {
                HouseInfoBean houseInfoBean = new HouseInfoBean();
                houseInfoBean.setPlotName(checkStringMapObject(map.get("plot_name")));
                houseInfoBean.setRoomCount(Integer.parseInt(checkIntMapObject(map.get("room"))));
                houseInfoBean.setHallCount(Integer.parseInt(checkIntMapObject(map.get("hall"))));
                houseInfoBean.setBathRoomCount(Integer.parseInt(checkIntMapObject(map.get("bathroom"))));
                houseInfoBean.setKitchCount(Integer.parseInt(checkIntMapObject(map.get("kitchen"))));
                houseInfoBean.setArea(Double.parseDouble(checkDecimalMapObject(map.get("area"))));
                houseInfoBean.setFloorCount(Integer.parseInt(checkIntMapObject(map.get("floor"))));
                houseInfoBean.setTotalFloorCount(Integer.parseInt(checkIntMapObject(map.get("total_floor"))));
                houseInfoBean.setDistrictName(checkStringMapObject(map.get("district_name")));
                houseInfoBean.setBlockName(checkStringMapObject(map.get("block_name")));
                houseInfoBean.setAddress(checkStringMapObject(map.get("address")));
                houseInfoBean.setTotalPrice(Double.parseDouble(checkDecimalMapObject(map.get("total_price"))));
                houseInfoBean.setAdvisorName(checkStringMapObject(map.get("realtor_name")));
                houseInfoBean.setAdvisorPhone(checkStringMapObject(map.get("realtor_phone")));
                List<BaseTag> tagList = houseManager.getTagNameListByHouseId(Long.parseLong(checkIntMapObject(map.get("id"))));
                if (tagList != null && tagList.size() > 0){
                    List<TagDTO> tagDtoList = new ArrayList<TagDTO>();
                    for (BaseTag baseTag : tagList) {
                        TagDTO tagDTO = new TagDTO();
                        tagDTO.setTagId(baseTag.getId().toString());
                        tagDTO.setTagName(baseTag.getTagName());
                        tagDTO.setTagColor(baseTag.getTagColor());
                        tagDtoList.add(tagDTO);
                    }
                    houseInfoBean.setTagList(tagDtoList);
                }
                houseList.add(houseInfoBean);
            }
            houseListRespBean.setHouseList(houseList);
            houseListRespBean.setPageSize(page.getPageSize());
            houseListRespBean.setPageNumber(page.getPageNumber());
            houseListRespBean.setTotalCount(page.getTotalSize());
        }
        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(houseListRespBean);
        return resultDO;
    }
}
