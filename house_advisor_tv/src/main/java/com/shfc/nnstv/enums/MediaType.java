package com.shfc.nnstv.enums;

/**
 * @Package com.shfc.house.enums.YesNo
 * @Description: 是否删除
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/1/10 10:46
 * version V1.0.0
 */
public enum MediaType {
    TEXT("文本", 0), PIC("图片", 1),VIDEO("视频",2);

    private final String name;
    private final int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    MediaType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(Integer val) {
        if (val != null) {
            int value = val;
            for (MediaType mediaType : MediaType.values()) {
                if (mediaType.value == value) {
                    return mediaType.name;
                }
            }
        }
        return "";
    }

    public MediaType getTypeByValue(int value) {
        for (MediaType mediaType : MediaType.values()) {
            if (mediaType.value == value) {
                return mediaType;
            }
        }
        return null;
    }
}
