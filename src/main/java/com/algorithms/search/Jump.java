package com.algorithms.search;

public class Jump {


    private int search(int[] elements, int searchElement, int jumpBlockSize) {
        // assumption the array is provided as sorting
        if (elements == null || elements.length == 0) {
            throw new RuntimeException("Arrays is empty!");
        }
        int i = 0;
        for (; i < elements.length; ) {
            if (elements[i] == searchElement) {
                return i;
            }
            int lastJumpIndex = 0;
            if (i != 0) {
                lastJumpIndex = i - jumpBlockSize + 1;
            }
            if (searchElement < elements[i]) {
                for (int j = lastJumpIndex; j < i; j++) {
                    if (elements[j] == searchElement) {
                        return j;
                    }
                }
            }

            // next jump index
            i = i + jumpBlockSize;
            // next jump index should not be greater than array last index
            // if the case take next jump index as last array index
            if (i > elements.length - 1) {
                i = elements.length - 1;
            }
        }
        throw new RuntimeException("Element not found!");
    }

    public static void main(String[] args) {
        //Complexity
        // Best case - O(1)
        // Worst case - O(√n), since ideal jump block size is √n
        // Average case - O(√n)
        // https://www.geeksforgeeks.org/jump-search/
        Jump jump = new Jump();
        // pre-requisite to be sorted
        System.out.println(jump.search(new int[]{1, 5, 7, 9}, 5, 2));
    }
}
