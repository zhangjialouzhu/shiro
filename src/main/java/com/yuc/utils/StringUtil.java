package com.yuc.utils;

import java.util.Scanner;

public class StringUtil {
    public static boolean isNotEmpty(String str){
       boolean is = false;
       if(!"".equals(str)&&null!=str){
           is = true;
       }
       return is;
    }


}
