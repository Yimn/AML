package com.yimnlu.AML_Platform.executor.staticReturn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayWorkDate {

    public static String WORKDATE() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date());
    }
}
