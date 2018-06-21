package com.dream.component_home.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dream.component_home.R;
import com.dream.component_home.R2;
import com.dream.component_util.base.BaseActivity;
import com.dream.component_util.common.RouterURLS;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * @author Administrator
 * @date 2018/6/20
 */

@Route(path = RouterURLS.HOME)
public class HomeActivity extends BaseActivity {


    @BindView(R2.id.tv_home)
    TextView tvHome;
    @BindView(R2.id.button)
    Button button;
    @BindView(R2.id.button2)
    Button button2;
    @BindView(R2.id.tv_parameter)
    TextView tvParameter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void initView() {
        setCenterTitle("Home");
        button.setText("button");
        button2.setText("button2");


        Bundle bundle = getIntent().getBundleExtra("bundle");
        assert bundle != null;
        String key1 = bundle.getString("key1");
        int key2 = bundle.getInt("key2");
        boolean key3 = bundle.getBoolean("key3");

        tvParameter.setText("参数一: " + key1 + "\n" + "参数二: " + key2 + "\n" + "参数三: " + key3);

    }

    @OnClick({R2.id.button, R2.id.button2})
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            Toast.makeText(this, "我是button", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.button2){
            Toast.makeText(this, "我是button2", Toast.LENGTH_SHORT).show();
        }
    }
}
