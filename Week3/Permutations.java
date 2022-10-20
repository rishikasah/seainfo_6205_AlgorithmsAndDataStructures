package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */
class Permutations {
    
    public List<List<Integer>> permute(int[] nums) {
    
    List<List<Integer>> result = new LinkedList<>();
    
    // convert array into list since the output is a list of lists
    ArrayList<Integer> nums_list = new ArrayList<Integer>();
    for (int num : nums)
      nums_list.add(num);

    int n = nums.length;
    backtrack(n, nums_list, result, 0);
    return result;
    }
    
    public void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> result, int first) {
        if (first == n)
            result.add(new ArrayList<Integer>(nums));
            
        for (int i = first; i < n; i++) {
            // place ith integer first in the current permutation
            Collections.swap(nums, first, i);
                
            // use next integers to complete the permutations
            backtrack(n, nums, result, first + 1);
            Collections.swap(nums, first, i);
        }
    }
}