package org.renhj.search;


/**
 * 二分查找变形问题
 * 1、查找第一个等于给定值的元素
 * 2、查找最后一个给定值的元素
 * 3、查找第一个大于等于给定值的元素
 * 4、查找最后一个小于等于给定值的元素
 * 
 */
public class BinarySearch02 {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,2,3,4,5,5,5,5,6,7,8,10,11,11,12,12,13};
        // 1、查找第一个等于给定值的元素
        int x = bSearch01(a, a.length, 5);
        System.out.println(x);
        // 2、查找最后一个给定值的元素
        x = bSearch02(a, a.length, 5);
        System.out.println(x);
        // 3、查找第一个大于等于给定值的元素
        x = bSearch03(a, a.length, 5);
        System.out.println(x);
        // 4、查找最后一个小于等于给定值的元素
        x = bSearch04(a, a.length, 5 );
        System.out.println(x);
    }

    /**
     * 思路：
     * 1、当a[mid] 小于 val 时，说明 val 在 mid 的右侧，所以将low 置为 mid + 1；
     * 2、当a[mid] 大于 val 时，说明 val 在 mid 的左侧，将high 置为 mid - 1；
     * 3、当a[mid] 等于 val 时，有两种情况：
     *      （1）mid 是第一个等于给定值的元素，要判断这种情况说明mid - 1 一定不等于val， 或这 mid 为 0 一定为第一个
     *      （2）mid 不是第一个等于给定值的元素，说明mid 一定在左侧，所以将high 置为mid-1，继续在左侧中查找
     * @param a 要查找的数组
     * @param length  数组的长度
     * @param val 要查找的值
     * @return val所在的位置 找到返回位置 否则返回-1
     */
    private static int bSearch01(int[] a, int length, int val) {
        int high = length -1;
        int low = 0;
        while (low <= high){
            int mid = low + ((high - low) >> 1);
            if (a[mid] < val){
                low = mid + 1;
            }else if (a[mid] > val){
                high = mid - 1;
            } else{
                if (mid == 0 || (a[mid-1] != val)){
                    return mid;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int bSearch02(int[] a, int length, int i) {
        return -1;
    }

    private static int bSearch03(int[] a, int length, int i) {
        return -1;
    }

    private static int bSearch04(int[] a, int length, int i) {
        return -1;
    }
}
