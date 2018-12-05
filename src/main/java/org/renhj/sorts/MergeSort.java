package org.renhj.sorts;


import java.util.Arrays;

/**
 * 归并排序
 *
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] {11,8,3,9,7,1,2,5};
        System.out.println("排序前：" + Arrays.toString(arr));
        merge_sort(arr, arr.length);
        System.out.println("排序后："+ Arrays.toString(arr));
    }

    // 归并排序
    public static void merge_sort(int[] a, int n){
        merge_sort(a, 0, n-1);
    }
    private static void merge_sort(int[] a, int p, int r){
        // 递归终止条件
        if (p>=r) return;
        // 获取分区点
        int q = p + (r-p)/2;
        // 分治排序左边
        merge_sort(a, p, q);
        // 分治排序右边
        merge_sort(a, q+1, r);
        // 将p-q 和 q+1-r 两个数组合并为一个数组并赋值给a[p,r]
        merge(a, p, q, r);
    }

    // 合并数组
    private static void merge(int[] a, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int k = 0;
        // 合并数组 a[p, q]  a[q+1, r] 到临时数组temp
        // 申请一个临时数组
        int[] temp = new int[r - p + 1];
        // 根据两个数组最短的长度进行比较添加到temp中
        while (i<=q&& j<=r){
            if (a[i]<=a[j]){
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }

        // 看哪个数组还没有完成，将其放到temp后
        if (i<=q){
            while (i<=q){
                temp[k++] = a[i++];
            }
        }else {
            while (j<=r){
                temp[k++] = a[j++];
            }
        }
        System.out.println(Arrays.toString(temp));

        // 将temp中对应的数据放入原数组中
        for (i = 0; i <= r-p; i++) {
            a[p+i] = temp[i];
        }
    }
}
