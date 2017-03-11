package com.example.qiuro.qiuweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by qiuro on 2017/3/9.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePalApplication.initialize(context);

    }

    public static Context getContext() {
        return context;
    }
}
