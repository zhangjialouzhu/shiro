package com.yuc.test;


public class Sort{
    //两两比较
    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
    //选出最大（小）放在前列
    public static int[] selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int min = arr[i];
            int temp = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }

        return  arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,31,54,13,23,52,120,2};
        for (int i:selectionSort(arr)){
            System.out.println(i);
        }
    }


}





