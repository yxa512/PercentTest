package com.example.administrator.percenttest.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Content
 * Created by yxa512 on 2017/9/17.
 */

public class P implements MultiItemEntity {

    public static final int TEXT = 1;
    public static final int IMG = 2;
    public static final int VIDEO = 3;

    private A a;
    private B b;
    private C c;

    private int itemType;

    public P(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }
}
