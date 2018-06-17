package com.app;

public class Solution {

    /*

    N elements

    Assume that:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [1..1,000,000,000].

    Complexity:
    expected worst-case time complexity is O(N);
    expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
     */

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] hits = new int[Math.min(A.length, 1_000_000)];

        for (int i = 0; i < A.length; i++) {
            int elem = A[i];
            if (elem <= hits.length) {
                if (hits[elem - 1] == 1) {
                    // second occurrence
                    return 0;
                } else {
                    hits[elem - 1] = 1;
                }
            }
        }

        for (int hit : hits) {
            if (hit == 0) {
                return 0;
            }
        }
        return 1;
    }
}
