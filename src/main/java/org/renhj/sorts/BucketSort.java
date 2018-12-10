package org.renhj.sorts;

import java.util.Arrays;

/**
 *  桶排序
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] a = new int[] {5,4,2,6,2,3,5,1,4,8,5,9,6,7,8,10,3,4,2,0}; // 20个人的成绩进行桶排序


        bucketSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bucketSort(int[] a) {

    }
}
