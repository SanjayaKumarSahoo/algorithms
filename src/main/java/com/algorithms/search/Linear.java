package com.algorithms.search;

public class Linear {


    private int search(int[] elements, int searchElement) {
        if (elements == null || elements.length == 0) {
            throw new RuntimeException("Arrays is empty!");
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == searchElement) {
                return i;
            }
        }
        throw new RuntimeException("Element not found!");
    }


    public static void main(String[] args) {
        // Complexity
        // Best case - O(1)
        // Worst case - O(n)
        // Average case - O(n)
        Linear linear = new Linear();
        System.out.println(linear.search(new int[]{1, 5, 7, 9}, 7));
    }
}
