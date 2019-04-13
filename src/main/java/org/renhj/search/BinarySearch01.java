package org.renhj.search;

/**
 *  二分搜索算法
 *  二分搜索只能在有序的数据中查找一个数据
 */
public class BinarySearch01 {

    public static void main(String[] args) {
        int[] a = new int[] {1,3,4,7, 8,15,34,123,435,534,912};
        int x = bSearch(a, a.length, 15);
        System.out.println(x);
    }

    private static int bSearch(int[] a, int length, int i) {
        int high = length-1;
        int low = 0;

        while (low <= high){
            int mid = low + (high - low)>>1;
            if (a[mid] == i){
                return mid;
            } else if (a[mid] < i){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
