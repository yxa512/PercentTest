package com.example.administrator.percenttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.percenttest.bean.A;
import com.example.administrator.percenttest.bean.B;
import com.example.administrator.percenttest.bean.C;
import com.example.administrator.percenttest.bean.M;
import com.example.administrator.percenttest.bean.P;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener, DatePicker.OnDateChangedListener {

    private HomeAdapter adapter;
    private M m;
    private TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.jump).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv1:
                List<P> list1 = new ArrayList<>();
                for (A a : m.getaList()) {
                    P p = new P(P.TEXT);
                    p.setA(a);
                    list1.add(p);
                }
                adapter.setNewData(list1);
                break;
            case R.id.tv2:
                List<P> list2 = new ArrayList<>();
                for (B a : m.getbList()) {
                    P p = new P(P.IMG);
                    p.setB(a);
                    list2.add(p);
                }
                adapter.setNewData(list2);
                break;
            case R.id.tv3:
                List<P> list3 = new ArrayList<>();
                for (C a : m.getcList()) {
                    P p = new P(P.VIDEO);
                    p.setC(a);
                    list3.add(p);
                }
                adapter.setNewData(list3);
                break;
            case R.id.button:
                test.setText("nihao");
                break;
            case R.id.jump:
                startActivity(new Intent(this, Test1.class));
                break;
            default:
                break;
        }
    }

    private void restartApplication() {
        final Intent intent = getPackageManager().getLaunchIntentForPackage(getPackageName());
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        android.os.Process.killProcess(android.os.Process.myPid());

    }

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

    }

    public class HomeAdapter extends BaseMultiItemQuickAdapter<P, BaseViewHolder> {
        public HomeAdapter(List data) {
            super(data);
            addItemType(P.TEXT, R.layout.item);
            addItemType(P.IMG, R.layout.item2);
            addItemType(P.VIDEO, R.layout.item3);
        }

        @Override
        protected void convert(BaseViewHolder helper, P item) {
            switch (helper.getItemViewType()) {
                case P.TEXT:
                    helper.setText(R.id.id_num, item.getA().getA_name());
                    break;
                case P.IMG:
                    helper.setText(R.id.id_num, item.getB().getB_name());
                    break;
                case P.VIDEO:
                    helper.setText(R.id.id_num, item.getC().getC_name());
                    break;
                default:
                    break;
            }

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}
