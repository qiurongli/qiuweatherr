package com.example.qiuro.qiuweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by qiuro on 2017/3/8.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
