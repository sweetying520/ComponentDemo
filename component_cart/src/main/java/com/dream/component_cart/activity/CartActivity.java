package com.dream.component_cart.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dream.component_cart.R;
import com.dream.component_util.base.BaseActivity;
import com.dream.component_util.common.RouterURLS;

/**
 * @author Administrator
 * @date 2018/6/20
 */

@Route(path = RouterURLS.CART)
public class CartActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cart;
    }

    @Override
    protected void initView() {
        setCenterTitle("Cart");
    }
}
