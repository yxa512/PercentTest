package com.example.administrator.percenttest;

import android.util.Log;
import android.view.View;

import com.example.administrator.percenttest.bean.LotteryBean;
import com.example.administrator.percenttest.bean.ResultInfo;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.yxa512.tool.base.BaseActivity;
import com.yxa512.tool.network.JsonCallback;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public boolean showToolBar() {
        return true;
    }

    @Override
    public void initView() {

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.jump).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                OkGo.<ResultInfo<List<LotteryBean>>>get("https://caipiao.36zx.cn/lottery/getLastMap")
                        .params("version", 1.0)
                        .execute(new JsonCallback<ResultInfo<List<LotteryBean>>>() {
                            @Override
                            public void onSuccess(Response<ResultInfo<List<LotteryBean>>> response) {
                                Log.i("yxa", response.body().getData().size() + "");
                            }
                        });
                break;
            case R.id.jump:

                HashMap<String, String> map = new HashMap<>();
                map.put("name", "y");
                map.put("pwd", "123");
                JSONObject jsonObject = new JSONObject(map);

                OkGo.<String>post("http://58.240.55.9:7018/ires-jslt/mobapp/logon.spr?method=login")
                        .upJson(jsonObject)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(Response<String> response) {

                            }
                        });

                break;
            default:
                break;
        }
    }

}
