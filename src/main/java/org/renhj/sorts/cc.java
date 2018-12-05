package org.renhj.sorts;

import java.util.Arrays;

/**
 * 两个有序数组合并
 * 1、申请一个临时数组，长度是两个数组的长度之和
 * 2、以两个数组中最短的一个为次数，循环遍历连个数组，并比较两个数组相同位置的值的大小，小的往临时数组中放，一直循环，知道将短的一个数组全部放到临时数组中
 * 3、判断哪个有剩余，将剩余的数组全部方法临时数组后面
 * 4、返回临时数组
 */
public class cc {

    public static void main(String[] args) {
        int[] a1 = new int[] {1,2,3,4,4,11,20};
        int[] a2 = new int[] {2,4,6,8,9,10,15};

        int[] a3 = merge(a1, a2);
        System.out.println(Arrays.toString(a3));
    }

    private static int[] merge(int[] a1, int[] a2) {
        int[] temp = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<a1.length && j<a2.length){
            if (a1[i]<a2[j]){
                temp[k++] = a1[i++];
            }else {
                temp[k++] = a2[j++];
            }
        }
        // 时间复杂度： O(min(a1.length, a2.length)

        if (i<a1.length){
            while (i<a1.length){
                temp[k++] = a1[i++];
            }
        }else {
            while (j<a2.length){
                temp[k++] = a2[j++];
            }
        }
        // 时间复杂度： O（|a1.length-a2.length|））

        return temp;
    }

}
