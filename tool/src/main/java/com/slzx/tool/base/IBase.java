package com.slzx.tool.base;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Content
 * Created by yxa512 on 2017/8/22.
 */

public interface IBase {

    void setLeftListener(View.OnClickListener listener);

    TextView getLeftTitle();

    ImageView getLeftImg();

}
