package com.dream.componentdemo;



import android.os.Bundle;
import android.view.View;

import com.dream.component_util.base.BaseActivity;
import com.dream.componentdemo.arouter.RouterCenter;

import butterknife.OnClick;


/**
 * @author Administrator
 */
public class MainActivity extends BaseActivity {




    @Override
    protected void initView() {
        setCenterTitle("测试入口");
    }



    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }



    @OnClick({R.id.btn_home, R.id.btn_cart, R.id.btn_me})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_home:
                Bundle bundle = new Bundle();
                bundle.putString("key1","key1");
                bundle.putInt("key2",1);
                bundle.putBoolean("key3",true);
                RouterCenter.toHome(bundle);
                break;
            case R.id.btn_cart:
                RouterCenter.toCart();
                break;
            case R.id.btn_me:
                RouterCenter.toMe();
                break;
            default:
                break;
        }
    }

    @Override
    protected boolean isShowBack() {
        return false;
    }
}
