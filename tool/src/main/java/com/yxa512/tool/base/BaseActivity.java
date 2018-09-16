package com.yxa512.tool.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.yxa512.tool.R;
import com.yxa512.tool.dialog.LoadingDialog;

/**
 * Content 基础类
 * Created by yxa512 on 2017/8/21.
 */

public abstract class BaseActivity extends AppCompatActivity implements IBase, ILoading {

    protected LoadingDialog loadingDialog = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = getContentView();
        setContentView(view);
        initView();
    }

    /**
     * 获取布局
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 是否显示标题栏
     *
     * @return
     */
    public abstract boolean showToolBar();

    /**
     * 界面初始化
     */
    public abstract void initView();


    private View getContentView() {
        View view = null;
        if (showToolBar()) {
            view = getLayoutInflater().inflate(R.layout.activity_base, null);
            FrameLayout contentView = (FrameLayout) view.findViewById(R.id.fl_content);
            contentView.addView(getLayoutInflater().inflate(getLayoutId(), null));
        } else {
            view = getLayoutInflater().inflate(getLayoutId(), null);
        }

        return view;
    }

    @Override
    public void setLeftListener(View.OnClickListener listener) {
        findViewById(R.id.ll_tbr_left).setOnClickListener(listener);
    }

    @Override
    public TextView getLeftTitle() {
        return findViewById(R.id.tv_left);
    }

    @Override
    public ImageView getLeftImg() {
        return findViewById(R.id.iv_left);
    }

    @Override
    public void setRightListener(View.OnClickListener listener) {
        findViewById(R.id.ll_tbr_right).setOnClickListener(listener);
    }

    @Override
    public TextView getRightTitle() {
        return findViewById(R.id.tv_right);
    }

    @Override
    public ImageView getRightImg() {
        return findViewById(R.id.iv_right);
    }

    @Override
    public TextView getTitleM() {
        return findViewById(R.id.tv_title);
    }

    @Override
    public TextView getTitleSub() {
        return findViewById(R.id.tv_title_sub);
    }

    @Override
    public ImageView getTitleRightImg() {
        return findViewById(R.id.iv_title_right);
    }

    @Override
    public ImageView getTitleCenterImg() {
        return findViewById(R.id.iv_title_center);
    }

    @Override
    public void showLoading() {
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog(BaseActivity.this);
        }
        if (!loadingDialog.isShowing() && !isFinishing()) {
            loadingDialog.show();
        }
    }

    @Override
    public void dismissLoading() {
        if (loadingDialog != null && loadingDialog.isShowing()
                && !isFinishing()) {
            loadingDialog.dismiss();
        }
    }

}
