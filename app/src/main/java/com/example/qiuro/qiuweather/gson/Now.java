package com.example.qiuro.qiuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qiuro on 2017/3/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
