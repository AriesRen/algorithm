package org.renhj.sorts;

import java.util.Arrays;

/**
 * 计数排序
 */
public class CountSort {
    public static void main(String[] args) {
        int[] a = new int[] {5,4,2,6,2,3,5,1,4,8,5,9,6,7,8,10,3,4,2,0}; // 20个人的成绩进行计数排序
        System.out.println("计数排序前："+Arrays.toString(a));
        countSort(a);
        System.out.println("计数排序后："+Arrays.toString(a));
    }
    private static void countSort(int[] a) {
        int n = a.length;
        /* 创建桶数组C */
        // 1、查找原数组的数据范围（必须是正整数）
        int max = a[0];
        for (int i = 0; i<a.length-1;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        // 2、根据数据范围创建桶数组
        int[] C = new int[max+1];
        // 2.1、扫描原数组，将数据的个数放入桶C中
        for (int anA : a) {
            C[anA]++;
        }
        // 2.2、将C数组中的数据依次累加
        for (int i=1;i<=max;i++){
            C[i] = C[i-1] + C[i];
        }
        // 3、根据C桶中的计数将原数组a中的数据依次放入A数组中
        // 3.1、创建临时数组A
        int[] A = new int[n];
        // 3.2、从后向前扫描a，并根据C放入A
        for (int i = n-1; i>=0; i--){
            A[C[a[i]]-1] = a[i];
            C[a[i]]--;
        }
        System.arraycopy(A, 0, a, 0, n);
    }
}
