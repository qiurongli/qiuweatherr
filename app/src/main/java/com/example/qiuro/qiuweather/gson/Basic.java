package com.example.qiuro.qiuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qiuro on 2017/3/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
