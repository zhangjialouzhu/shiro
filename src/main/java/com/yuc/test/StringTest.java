package com.yuc.test;

public class StringTest {

    public static void main(String[] args) {
        int n= 5;
        for (int i = 0; i <= n; i++) {
            for (int j = (i - 1) * i / 2 + 1; j <= (i + 1) * i / 2; j++) {
                System.out.print(j);
                if(j<(i + 1) * i / 2)
                    System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = (i - 1) * i / 2 + 1;j<=(i + 1) * i / 2; j++) {
                System.out.print(j);
                if(j<(i + 1) * i / 2)
                    System.out.print("*");
            }
            System.out.println("");

        }
    }
}
