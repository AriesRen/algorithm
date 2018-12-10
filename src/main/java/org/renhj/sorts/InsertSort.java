package org.renhj.sorts;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,56,134,76,7,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            for (int j=i-1; j>=0; j--){
               if (arr[j]>temp){
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
            }
        }

    }
}
