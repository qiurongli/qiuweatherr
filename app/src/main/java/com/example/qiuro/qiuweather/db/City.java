package com.example.qiuro.qiuweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by qiuro on 2017/3/7.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市名字
    private int cityCode;//市的代号
    private int provinceId;//所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
