package org.renhj.sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,56,134,76,7,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag)break;
        }
    }

}
