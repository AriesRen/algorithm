package org.renhj.sorts;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,56,134,76,7,4};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i=0; i<arr.length;i++){
            int min = i; // min存放需要交换的较小元素的下标
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
