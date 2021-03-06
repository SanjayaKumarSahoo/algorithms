package com.algorithms.search;

public class Binary {

    private int search(int[] elements, int searchElement) {
        // assumption the array is provided as sorting
        if (elements == null || elements.length == 0) {
            throw new RuntimeException("Arrays is empty!");
        }
        int start = 0;
        int end = elements.length;
        for (; start < end; ) {
            int mid = (start + end) / 2;
            if (elements[mid] == searchElement) {
                return mid;
            }

            if (searchElement <= elements[mid]) {
                end = mid;
            }

            if (searchElement > elements[mid]) {
                start = mid;
            }
        }
        throw new RuntimeException("Element not found!");
    }

    public static void main(String[] args) {
        // Complexity
        // Best case - O(1)
        // Worst case - O(log n)
        // Average case - O(log n)
        Binary binary = new Binary();
        // pre-requisite to be sorted
        System.out.println(binary.search(new int[]{0, 1, 5, 7, 9}, 5));
    }
}
