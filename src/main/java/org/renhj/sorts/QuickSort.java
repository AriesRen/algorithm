package org.renhj.sorts;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9,7,4,6,34,2,4,1,10,123333, 0, -2};
        quickSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int n) {
        if (n < 1) return;
        quickSort(arr, 0 , n-1);
    }
    private static void quickSort(int[] arr, int left, int right) {
        if (left>=right) return; // 重要，不然会导致栈溢出
        int mid = partation(arr, left, right);
        quickSort(arr, left, mid-1);
        quickSort(arr, mid+1, right);
    }

    // 查找中间位置
    private static int partation(int[] arr, int left, int right) {
        int base = arr[left];
        int i = left, j = right;

        while(i<j){
            while (i<j && arr[j] >= base) j--;
            while (i<j && arr[i] <= base) i++;

            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[left] = arr[i];
        arr[i] = base;
        return i;

    }


}
