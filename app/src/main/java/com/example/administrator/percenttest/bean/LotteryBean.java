package com.example.administrator.percenttest.bean;

import java.util.List;

/**
 * Content
 * Created by yxa512 on 2018/9/13.
 */
public class LotteryBean {


    /**
     * key : pl518248
     * id : 2c936a5d65c8fb700165cde1b3860011
     * content :
     * openCode1Array : ["9","3","9","9","1"]
     * lotteryName : 排列五
     * createTime : 1536757446000
     * list : []
     * openTime : 1536755400000
     * openCode1 : 9,3,9,9,1
     * openCode2 :
     * lottery : pl5
     * viewNum : 0
     * expect : 18248
     * sales : 10,238,474
     * week : 周三
     */

    private String key;
    private String id;
    private String content;
    private String lotteryName;
    private long createTime;
    private long openTime;
    private String openCode1;
    private String openCode2;
    private String lottery;
    private int viewNum;
    private String expect;
    private String sales;
    private String week;
    private List<String> openCode1Array;
    private List<String> openCode2Array;
    private List<?> list;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public String getOpenCode1() {
        return openCode1;
    }

    public void setOpenCode1(String openCode1) {
        this.openCode1 = openCode1;
    }

    public String getOpenCode2() {
        return openCode2;
    }

    public void setOpenCode2(String openCode2) {
        this.openCode2 = openCode2;
    }

    public String getLottery() {
        return lottery;
    }

    public void setLottery(String lottery) {
        this.lottery = lottery;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public List<String> getOpenCode1Array() {
        return openCode1Array;
    }

    public void setOpenCode1Array(List<String> openCode1Array) {
        this.openCode1Array = openCode1Array;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public List<String> getOpenCode2Array() {
        return openCode2Array;
    }

    public void setOpenCode2Array(List<String> openCode2Array) {
        this.openCode2Array = openCode2Array;
    }

}
