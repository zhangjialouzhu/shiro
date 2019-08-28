package com.yuc.service.impl;

import org.junit.Test;

import java.util.Scanner;

public class MyTest {

    @Test
    public  void myPrint(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = (i-1)*i/2+1; j <= (i+1)*i/2 ; j++) {
                System.out.print(j+"\t");
            }
            System.out.println("");
        }
    }
}
