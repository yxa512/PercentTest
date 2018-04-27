package com.example.administrator.percenttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.percenttest.bean.A;
import com.example.administrator.percenttest.bean.B;
import com.example.administrator.percenttest.bean.C;
import com.example.administrator.percenttest.bean.M;
import com.example.administrator.percenttest.bean.P;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener {

    private HomeAdapter adapter;
    private M m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = LayoutInflater.from(this);
        View head1 = inflater.inflate(R.layout.head1, null);
        View head2 = inflater.inflate(R.layout.head2, null);
        View head3 = inflater.inflate(R.layout.bar, null);

        FlowLayout flowlayout = (FlowLayout) findViewById(R.id.flowlayout);

        List<String> list = new ArrayList();
        list.add("123457896");
        list.add("995");
        list.add("456");
        list.add("789");
        list.add("123456");
        list.add("4512871");
        list.add("12");
        list.add("488132659");
        list.add("154813317");
        list.add("789");
        for (String str : list) {
            View view = inflater.inflate(R.layout.head1, null);
            final TextView tv = (TextView) view.findViewById(R.id.id_num);
            tv.setText(str);
            ImageView iv = (ImageView) view.findViewById(R.id.iv_del);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "tv=" + tv.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

            MarginLayoutParams params = new MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(15, 15, 15, 15);
            view.setLayoutParams(params);
            flowlayout.addView(view);
            // 务必要加这句
            flowlayout.requestLayout();

        }


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
            default:
                break;
        }
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
