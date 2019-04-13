package org.renhj.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 *  1、如果有n个台阶，每次你可以跨1个台阶或者2个台阶，请问走完这n个台阶有多少种走法？
 *      f(n) = f(n-1) + f(n-2)
 */
public class Footstep {

    private static Map<Integer, Object> map = new HashMap<>();

    public static void main(String[] args) {
        int x = (int) f(10);
        System.out.println(x);
    }

    private static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n)){
            return (int) map.get(n);
        }
        int x = f(n-1) + f(n-2);
        map.put(n, x);
        return x;
    }
}
