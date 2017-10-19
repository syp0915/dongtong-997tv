package com.shfc.nnstv.service.impl;

import com.shfc.common.base.ValidateHelper;
import com.shfc.common.result.ResultDO;
import com.shfc.mybatis.pagination.Page;
import com.shfc.nnstv.constant.ErrorConstant;
import com.shfc.nnstv.dto.httpbean.resp.NewsContentRespBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsInfoBean;
import com.shfc.nnstv.dto.httpbean.resp.NewsInfoListRespBean;
import com.shfc.nnstv.enums.MediaType;
import com.shfc.nnstv.manager.NewsManager;
import com.shfc.nnstv.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Copyright: Copyright (c) 2016
 * Company:上海房产
 *
 * @author wky
 * @version V1.0
 * @create 2017-04-25 09:43
 **/
@Service
public class NewsServiceImpl extends BaseServiceImpl implements NewsService{
    @Autowired
    private NewsManager newsManager;

    /**
     * 根据条件查询新闻列表
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public ResultDO<NewsInfoListRespBean> newsList(Integer pageNumber, Integer pageSize) {
        ResultDO<NewsInfoListRespBean> resultDO=new ResultDO<NewsInfoListRespBean>();
        if(pageNumber==null){
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }
        if(pageSize==null){
            resultDO.setErrCode(ErrorConstant.NULL_PARAMETER.getCode());
            resultDO.setErrMsg(ErrorConstant.NULL_PARAMETER.getMsg());
            return resultDO;
        }

        Page<HashMap<String,Object>> page=newsManager.newsList(pageNumber,pageSize);
        List<HashMap<String,Object>> list=page.getData();
        NewsInfoListRespBean newsInfoListRespBean=new NewsInfoListRespBean();
        List<NewsInfoBean> arrayList=new ArrayList<>();
        for(HashMap<String,Object> map:list){
            NewsInfoBean dto=new NewsInfoBean();
            dto.setInformId(Integer.parseInt(checkStringMapObject(map.get("informId"))));
            dto.setInformTitle(checkStringMapObject(map.get("informTitle")));
            dto.setNewsFrom(checkStringMapObject(map.get("newsFrom")));
            dto.setPicUrl(checkStringMapObject(map.get("picUrl")));
            dto.setPublishTime(checkStringMapObject(map.get("publishTime")));
            String videoUrl = checkStringMapObject(map.get("videoUrl"));
            String picUrl = checkStringMapObject(map.get("picUrl"));

//            if(!ValidateHelper.isEmpty(dto.getPicUrl())||!ValidateHelper.isEmpty(videoUrl)){
//               if(!ValidateHelper.isEmpty(dto.getPicUrl())&&ValidateHelper.isEmpty(videoUrl)){
//                    dto.setFlag(String.valueOf(MediaType.PIC.getValue()));
//               }
//                if(ValidateHelper.isEmpty(dto.getPicUrl())&&!ValidateHelper.isEmpty(videoUrl)){
//                    dto.setFlag(String.valueOf(MediaType.VIDEO.getValue()));
//                }
//
//            }else {
//                dto.setFlag(String.valueOf(MediaType.TEXT.getValue()));
//            }

            //默认都是文本,数据错误时候，video优先级最高，图片次之，文本最低
            dto.setFlag(String.valueOf(MediaType.TEXT.getValue()));
            if (!ValidateHelper.isEmpty(picUrl)){
                dto.setFlag(String.valueOf(MediaType.PIC.getValue()));
            }
            if (!ValidateHelper.isEmpty(videoUrl)){
                dto.setFlag(String.valueOf(MediaType.VIDEO.getValue()));
            }
            arrayList.add(dto);
        }
        newsInfoListRespBean.setList(arrayList);
        newsInfoListRespBean.setPageNumber(page.getPageNumber());
        newsInfoListRespBean.setPageSize(page.getPageSize());
        newsInfoListRespBean.setTotalPage(page.getTotalPage());
        newsInfoListRespBean.setTotalCount(page.getTotalSize());
        resultDO.setData(newsInfoListRespBean);
        resultDO.setSuccess(true);

        return resultDO;
    }

    @Override
    public ResultDO<NewsContentRespBean> queryNewsContent(String informId) {
        ResultDO<NewsContentRespBean> resultDO=new ResultDO<NewsContentRespBean>();
        NewsContentRespBean bean=newsManager.queryNewsContent(informId);
        resultDO.setData(bean);
        resultDO.setSuccess(true);
        return resultDO;
    }
}
