package com.yuc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("yuc","yuchuang");
        map.put("1","11");
        map.put("2","22");
       /* Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry =(Map.Entry) it.next();
            System.out.println(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("\""+key+"\""+":"+"\""+value+"\"");
        }*/


       /*for (Map.Entry entry:map.entrySet()){
           System.out.println(entry.getKey()+":"+entry.getValue());
       }*/

        /*for (Iterator it = map.keySet().iterator();it.hasNext();){
            Object obj = it.next();
            System.out.println(obj+":"+map.get(obj));

        }*/
       /* for (Object o:map.keySet()){
            System.out.println(o+":"+map.get(o));
        }*/
         for (Object o:map.values()){
            System.out.println(o);
        }


    }
}
