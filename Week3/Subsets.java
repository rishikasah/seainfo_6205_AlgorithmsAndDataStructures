package Week3;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>(); 
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < nums.length; i++) {
            
            int len = result.size();
            for (int j = 0; j < len; j++) {
                
                List<Integer> subsetArr = new ArrayList<Integer>(result.get(j));
                subsetArr.add(nums[i]);
                result.add(subsetArr);
        }
    }
    return result;
    }
}

