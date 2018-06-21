package com.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyClass {

    public static void main(String arg[]) {

        List<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");

        System.out.println(judge("-0.11"));
    }

    public static String judge(String str) {
        try {
            double d=Double.valueOf(str);
            return (int)(Math.abs(d)*100)+"%";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数
     */
    public static String getNextDay(String f, String nowdate, int delay) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(f);
            String mdate = "";
            Date d = format.parse(nowdate);
            long myTime = (d.getTime() / 1000) + delay * 24 * 60 * 60;
            d.setTime(myTime * 1000);
            mdate = format.format(d);
            return mdate;
        } catch (Exception e) {
            return "";
        }
    }


    /**
     * 根据一个日期，返回是星期几的字符串
     *
     * @param sdate
     * @return
     */
    public static int getWeek(String f, String sdate) {
        // 再转换为时间
        try {
            SimpleDateFormat format = new SimpleDateFormat(f);
            Date d = format.parse(sdate);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            return c.get(Calendar.DAY_OF_WEEK);
        } catch (Exception ex) {

        }
        return -1;
    }

}
