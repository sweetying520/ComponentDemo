package com.dream.component_me.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dream.component_me.R;
import com.dream.component_util.base.BaseActivity;
import com.dream.component_util.common.RouterURLS;

/**
 *
 * @author Administrator
 * @date 2018/6/20
 */

@Route(path = RouterURLS.ME)
public class MeActivity extends BaseActivity{
    @Override
    protected int getLayoutId() {
        return R.layout.activity_me;
    }

    @Override
    protected void initView() {
        setCenterTitle("Me");
    }
}
