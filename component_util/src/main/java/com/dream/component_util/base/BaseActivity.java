package com.dream.component_util.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dream.component_util.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author Administrator
 * @date 2018/6/20
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected Unbinder mUnbinder;
    private TextView tvToolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);
        initToolbar();
        setContentView(getLayoutId());
        initView();
    }

    private void initToolbar() {
        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        assert getSupportActionBar() != null;
        if (isShowBack()) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tvToolbarTitle = mToolbar.findViewById(R.id.tv_toolbar_title);
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected boolean isShowBack() {
        return true;
    }

    @Override
    public void setContentView(int layoutResID) {
        setContentView(View.inflate(this, layoutResID, null));
    }

    @Override
    public void setContentView(View view) {
        FrameLayout flContent = findViewById(R.id.fl_content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        flContent.addView(view, layoutParams);
        mUnbinder = ButterKnife.bind(this, view);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }

    protected void setCenterTitle(String title) {
        if (!TextUtils.isEmpty(title)) {
            tvToolbarTitle.setText(title);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
