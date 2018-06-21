package com.dream.componentdemo.arouter;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.dream.component_util.common.RouterURLS;


/**
 * 路由中心
 * @author Administrator
 */
public class RouterCenter {


    public static void toHome(Bundle bundle) {
        ARouter.getInstance().build(RouterURLS.HOME).withBundle("bundle",bundle).navigation();
    }


    public static void toCart() {
        ARouter.getInstance().build(RouterURLS.CART).navigation();
    }


    public static void toMe() {
        ARouter.getInstance().build(RouterURLS.ME).navigation();
    }
}
