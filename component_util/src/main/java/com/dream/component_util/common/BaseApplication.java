package com.dream.component_util.common;

import android.app.Application;
import android.content.res.Configuration;


import com.dream.component_util.BuildConfig;
import com.dream.component_util.arouter.RouterConfig;


/**
 * @Created by TOME .
 * @时间 2018/5/14 17:20
 * @描述 ${保存全局变量设计的基本类application}
 */

public class BaseApplication extends Application {


    private static BaseApplication mBaseApplication;


    public static BaseApplication getAppContext() {
        return mBaseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mBaseApplication = this;
        //arouter路由初始化
        RouterConfig.init(this, BuildConfig.DEBUG);
    }


    /**
     * 程序终止的时候执行
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
        exitApp();
    }

    /**
     * 退出应用
     */
    public void exitApp() {

    }


    /**
     * 低内存的时候执行
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

    // 程序在内存清理的时候执行

    /**
     * 程序在内存清理的时候执行
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

    }
}
