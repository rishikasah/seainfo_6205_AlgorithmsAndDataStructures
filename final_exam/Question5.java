package final_exam;

import java.util.Arrays;

/*
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 */

public class Question5 {


    public int findSumClosestToTarget(int[] nums, int target) {

        int closestVal = Integer.MAX_VALUE, closestSum;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){

            int leftPtr=i+1, rightPtr= nums.length-1;

            while(leftPtr < rightPtr){

                closestSum=target - nums[i] - nums[leftPtr]-nums[rightPtr];

                if(closestSum==0)
                    return target - closestSum;
                if(Math.abs(closestVal) > Math.abs(closestSum))
                    closestVal=closestSum;

                if(closestSum > 0)
                    leftPtr++;
                else
                    rightPtr--;
            }
        }
        return target - closestVal;
    }

}
