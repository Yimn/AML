package com.yimnlu.AML.executor.staticReturn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayWorkDate {

    public static String WORKDATE() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String str = sdf.format(new Date());
        return str;
    }
}
