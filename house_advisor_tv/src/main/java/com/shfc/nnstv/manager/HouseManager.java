package com.shfc.nnstv.manager;

import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dao.BaseTagMapper;
import com.shfc.nnstv.dao.RealtorHouseMapper;
import com.shfc.nnstv.domain.BaseTag;
import com.shfc.nnstv.dto.TVBoxDTO;
import com.shfc.nnstv.utils.DFRNetUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午2:38.
 */
@Service
public class HouseManager {

    private static Logger logger = Logger.getLogger(HouseManager.class);

    @Autowired(required = false)
    private RealtorHouseMapper realtorHouseMapper;

    @Autowired(required = false)
    private BaseTagMapper baseTagMapper;

    @Autowired(required = false)
    private DFRNetUtil dfrNetUtil;

    /**
     * 通过mac地址远程调用东方云接口获取机顶盒信息
     * @param mac
     * @return
     */
    public ResultDO<TVBoxDTO> getTVBoxInfoByCondition(String mac){
        logger.info("mac--------------------->" + mac);
        ResultDO<TVBoxDTO> resultDO = new ResultDO<TVBoxDTO>();
        /*String result = dfrNetUtil.doQueryTVBoxInfo(mac);
        if (result == null || "".equals(result)) {
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.REMOTE_SERVER_RESULT_EXCEPTION.getCode());
            resultDO.setErrMsg(ErrorConstant.REMOTE_SERVER_RESULT_EXCEPTION.getMsg());
            return resultDO;
        }
        logger.info("[remote]tvbox info is--------------------->" + result);
        JSONObject jsonObject = JSONObject.fromObject(result);
        if (jsonObject == null || jsonObject.get("respJson") == null){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.JSON_STRING_CAST_EXCEPTION.getCode());
            resultDO.setErrMsg(ErrorConstant.JSON_STRING_CAST_EXCEPTION.getMsg());
            return resultDO;
        }
        CommonRespBean commonRespBean = (CommonRespBean) JSONObject.toBean(jsonObject, CommonRespBean.class);
        Map<String, Class> classMap = new HashMap<String, Class>();
        classMap.put("data", TVBoxDTO.class);
        ResultDO<TVBoxDTO> tvResult = (ResultDO<TVBoxDTO>) JSONObject.toBean(JSONObject.fromObject(commonRespBean.getRespJson()), ResultDO.class, classMap);
        if (!tvResult.isSuccess()){
            resultDO.setSuccess(false);
            resultDO.setErrCode(tvResult.getErrCode());
            resultDO.setErrMsg(tvResult.getErrMsg());
            return resultDO;
        }

        TVBoxDTO tvBoxDTO = tvResult.getData();
        if (tvBoxDTO == null){
            resultDO.setSuccess(false);
            resultDO.setErrCode(ErrorConstant.REMOTE_SERVER_RESULT_EXCEPTION.getCode());
            resultDO.setErrMsg(ErrorConstant.REMOTE_SERVER_RESULT_EXCEPTION.getMsg());
            return resultDO;
        }*/

        TVBoxDTO tvBoxDTO = new TVBoxDTO();
        tvBoxDTO.setBlock("新华路");
        tvBoxDTO.setBlockId(108L);
        tvBoxDTO.setBuildingId(289714L);
        tvBoxDTO.setBuildingNo("10号");

        tvBoxDTO.setDistrictId(310105L);
        tvBoxDTO.setMac(mac);
        tvBoxDTO.setResCategory("智能1000");
        tvBoxDTO.setResCode("5010");
        tvBoxDTO.setResName("SVA超高清智能型机顶盒");
        tvBoxDTO.setResidenceId(53L);
        if ((System.currentTimeMillis()/1000/60) % 2 == 0){
            tvBoxDTO.setDistrict("长宁区");
            tvBoxDTO.setResidenceName("朗诗虹桥绿郡");
            tvBoxDTO.setLat(31.216877);
            tvBoxDTO.setLon(121.419868);
        }else {
            tvBoxDTO.setDistrict("静安区");
            tvBoxDTO.setResidenceName("泰府名邸");
            tvBoxDTO.setLat(31.242256);
            tvBoxDTO.setLon(121.461629);
        }
        tvBoxDTO.setSerialNo("94A51A2984663809A");

        resultDO.setSuccess(true);
        resultDO.setErrCode(ErrorConstant.SUCCESS.getCode());
        resultDO.setErrMsg(ErrorConstant.SUCCESS.getMsg());
        resultDO.setData(tvBoxDTO);
        return resultDO;
    }

    /**
     * 数据库查询房源列表
     * @param latitude
     * @param longitude
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public Page<HashMap<String,Object>> getHouseListByCondition(double latitude, double longitude, Integer pageSize, Integer pageNumber){
        Page<HashMap<String, Object>> query = new Page<HashMap<String, Object>>(pageNumber, pageSize);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("longitude", longitude);
        params.put("latitude", latitude);
        query.setQuery(params);
        realtorHouseMapper.getHouseListByCondition(query);
        return query;
    }

    /**
     * 根据经纪人Id查询委托房源列表
     * @param latitude
     * @param longitude
     * @param pageSize
     * @param pageNumber
     * @return
     */
    public Page<HashMap<String,Object>> getHouseListByRealtorId(double latitude, double longitude,Long realtorId,Integer pageSize, Integer pageNumber){
        Page<HashMap<String, Object>> query = new Page<HashMap<String, Object>>(pageNumber, pageSize);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("longitude", longitude);
        params.put("latitude", latitude);
        params.put("realtorId", realtorId);
        query.setQuery(params);
        realtorHouseMapper.getHouseListByRealtorId(query);
        return query;
    }

    /**
     * 根据房源id获取标签列表
     * @param houseId
     * @return
     */
    public List<BaseTag> getTagNameListByHouseId(Long houseId){
        return baseTagMapper.getTagListByHouseId(houseId);
    }
}
