package Week3;

import java.util.LinkedList;
import java.util.List;

/*
 * Given two integers n and k, return an array of all the integers of length n where the difference between every two consecutive digits is k. 
 * You may return the answer in any order. Note that the integers should not have leading zeros. Integers as 02 and 043 are not allowed.
 */
class NumbersWithSameConsecutiveDiff {
 
    public int[] numsSameConsecDiff(int N, int K) {
        
        if (N == 1) 
            return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        List<Integer> result = new LinkedList<>();
        
        for (int start = 1, end = 9; start <= end; start++) {
            fillArray(result, N - 1, K, start);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    public void fillArray(List<Integer> result, int N, int K, int num) {        
        if (N == 0) {
            result.add(num);
            return;
        }
        
        for (int start = 0, end = 9; start <= end; start++) {
            
            if (Math.abs(num % 10 - start) == K) 
                fillArray(result, N - 1, K, num * 10 + start);    
        }
    }
}