package com.yxa512.tool.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.yxa512.tool.R;


/**
 * Content 加载提示框
 * Created by yxa512 on 2017/8/25.
 */

public class LoadingDialog extends Dialog {

    public LoadingDialog(Context context) {
        super(context, R.style.CustomDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_loading);
    }

}