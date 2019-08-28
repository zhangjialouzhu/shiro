package com.yuc.test;

public class MyFinal {
    public static void get(int i) {
       int result = 0;
            switch (i){
                case 1:
                    result = result + i;
                case 2:
                    result = result + i*2;
                case 3:
                    result = result + i*3;

            }
        System.out.println(result);
    }
    public void gets(int a,String b){}
    public void gets(String a,int b){}








    

    public static void main(String[] args) {
        get(2);

    }
}
