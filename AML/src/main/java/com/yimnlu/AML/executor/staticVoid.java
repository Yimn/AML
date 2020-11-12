package com.yimnlu.AML.executor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class staticVoid {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String str = sdf.format(new Date());
        System.out.print(str);
    }
}
