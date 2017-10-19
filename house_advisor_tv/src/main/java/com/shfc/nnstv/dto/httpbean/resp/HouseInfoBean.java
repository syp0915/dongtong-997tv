package com.shfc.nnstv.dto.httpbean.resp;

import com.shfc.nnstv.dto.TagDTO;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/4/20 下午5:40.
 */
public class HouseInfoBean implements Serializable {
    private String plotName;//	小区名称
    private Integer roomCount;//	室数
    private Integer hallCount;//	厅数
    private Integer bathRoomCount;//	卫生间数
    private Integer kitchCount;//	厨房数
    private Double area;//	面积
    private Integer floorCount;//	所在楼层
    private Integer totalFloorCount;//	总理楼层
    private String districtName;//	区域名称
    private String blockName;//	板块名称
    private String address;//	详细地址
    private List<TagDTO> tagList;//	标签列表
    private Double totalPrice;//	总价
    private String advisorName;//	置业顾问名字
    private String advisorPhone;//	置业顾问手机号

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getHallCount() {
        return hallCount;
    }

    public void setHallCount(Integer hallCount) {
        this.hallCount = hallCount;
    }

    public Integer getBathRoomCount() {
        return bathRoomCount;
    }

    public void setBathRoomCount(Integer bathRoomCount) {
        this.bathRoomCount = bathRoomCount;
    }

    public Integer getKitchCount() {
        return kitchCount;
    }

    public void setKitchCount(Integer kitchCount) {
        this.kitchCount = kitchCount;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    public Integer getTotalFloorCount() {
        return totalFloorCount;
    }

    public void setTotalFloorCount(Integer totalFloorCount) {
        this.totalFloorCount = totalFloorCount;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<TagDTO> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagDTO> tagList) {
        this.tagList = tagList;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getAdvisorPhone() {
        return advisorPhone;
    }

    public void setAdvisorPhone(String advisorPhone) {
        this.advisorPhone = advisorPhone;
    }
}
