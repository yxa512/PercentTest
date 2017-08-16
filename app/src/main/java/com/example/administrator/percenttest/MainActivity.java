package com.example.administrator.percenttest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.zhy.autolayout.AutoLayoutActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AutoLayoutActivity {

    @Bind(R.id.tv)
    TextView tv;
    @Bind(R.id.bt_1)
    Button bt1;
    @Bind(R.id.bt_2)
    Button bt2;
    @Bind(R.id.bt_3)
    Button bt3;
    @Bind(R.id.bt_4)
    Button bt4;
    @Bind(R.id.bt_5)
    Button bt5;
    @Bind(R.id.bt_6)
    Button bt6;
    @Bind(R.id.bt_7)
    Button bt7;
    private int call_id;
    private String fromNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

}
