package com.slzx.tool.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Content 短暂对话框工具类
 * Created by yxa512 on 2017/8/25.
 */

public class ToastUtil {

    public static void toastShort(Context context, String content) {
        if (context != null) {
            Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
        }
    }

}
