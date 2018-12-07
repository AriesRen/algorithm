package org.renhj.sorts;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 快速排序
 *
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9,7,4,6,34,2,4,1,10,12};
        quickSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int n) {
        if (n < 1) return;
        quickSort(arr, 0 , n-1);
    }
    private static void quickSort(int[] arr, int left, int right) {
        if (left>=right) return;
        int mid = partation1(arr, left, right);
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
    // 查找中间位置
    private static int partation1(int[] a, int left, int right){
        int pivot = a[right];
        int i = left;
        for (int j=left; j<=right-1;j++){
            if (a[j]<pivot){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        a[right] = a[i];
        a[i] = pivot;
        return i;
    }


}
