package com.example.administrator.percenttest.bean;

/**
 * Content
 * Created by yxa512 on 2017/8/24.
 */

public class ResultInfo<T> extends BaseResult {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}