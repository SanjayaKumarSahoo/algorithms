package com.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static int findNFibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 2) {
            return 1;
        }
        int result = findNFibonacci(n - 1) + findNFibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findNFibonacci(5));
    }
}
