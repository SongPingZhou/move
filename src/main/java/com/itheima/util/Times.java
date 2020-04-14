package com.itheima.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Times {
    public static String getTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
