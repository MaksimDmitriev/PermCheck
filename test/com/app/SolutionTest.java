package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void singleOne() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{1}));
    }

    @Test
    public void singleNotOne() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{2}));
    }

    @Test
    public void twoElements() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{1, 2}));
    }

    @Test
    public void twoElementsWithMissing() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{1, 3}));
    }

    @Test
    public void twoBigNumbers() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{1000, 300}));
    }

    @Test
    public void small() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{1, 2, 4, 3}));
    }

    @Test
    public void smallWithDuplicates() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{1, 2, 2, 4, 3}));
    }

    @Test
    public void smallWithMissing() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{1, 4, 3}));
    }

    @Test
    public void missingOne() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{2, 4, 3}));
    }
}