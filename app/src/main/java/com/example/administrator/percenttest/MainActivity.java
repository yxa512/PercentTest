package com.example.administrator.percenttest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.percenttest.bean.A;
import com.example.administrator.percenttest.bean.B;
import com.example.administrator.percenttest.bean.C;
import com.example.administrator.percenttest.bean.M;
import com.example.administrator.percenttest.bean.P;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener{

    private HomeAdapter adapter;
    private M m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView)findViewById(R.id.RecyclerView);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HomeAdapter(null);
        LayoutInflater inflater = LayoutInflater.from(this);
        View head1 = inflater.inflate(R.layout.head1,null);
        View head2 = inflater.inflate(R.layout.head2,null);
        View head3 = inflater.inflate(R.layout.bar,null);
        adapter.addHeaderView(head1);
        adapter.addHeaderView(head2);
        adapter.addHeaderView(head3);

        head3.findViewById(R.id.tv1).setOnClickListener(this);
        head3.findViewById(R.id.tv2).setOnClickListener(this);
        head3.findViewById(R.id.tv3).setOnClickListener(this);

        recycler.setAdapter(adapter);

        m = new M();

        List<A> list = new ArrayList<>();
        for (int i=1;i<=20;i++){
            list.add(new A("A="+i));
        }
        m.setaList(list);

        List<B> list2 = new ArrayList<>();
        for (int i=1;i<=20;i++){
            list2.add(new B("B="+i));
        }
        m.setbList(list2);

        List<C> list3 = new ArrayList<>();
        for (int i=1;i<=20;i++){
            list3.add(new C("C="+i));
        }
        m.setcList(list3);

        //adapter.addData(m.getaList());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv1:
                List<P> list1 = new ArrayList<>();
                for(A a:m.getaList()){
                    P p = new P(P.TEXT);
                    p.setA(a);
                    list1.add(p);
                }
                adapter.setNewData(list1);
                break;
            case R.id.tv2:
                List<P> list2 = new ArrayList<>();
                for(B a:m.getbList()){
                    P p = new P(P.IMG);
                    p.setB(a);
                    list2.add(p);
                }
                adapter.setNewData(list2);
                break;
            case R.id.tv3:
                List<P> list3 = new ArrayList<>();
                for(C a:m.getcList()){
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
            super( data);
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
                    helper.setText(R.id.id_num,  item.getB().getB_name());
                    break;
                case P.VIDEO:
                    helper.setText(R.id.id_num,  item.getC().getC_name());
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
