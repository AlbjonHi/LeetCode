package Solutions;

import java.util.*;

/*
    Given a 0-indexed integer array nums of length n and an integer target,
    return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 */
public class CountPairs {
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        System.out.println(countPairs(nums, -2));
    }
    
    public static int countPairs(List<Integer> nums, int target) {
        int ret=0;
        for(int left=0;left<nums.size();left++) {
            for (int right = 1; right < nums.size(); right++) {
                if (nums.get(left) + nums.get(right) < target)
                    if(left<right)
                        ret++;
            }
        }
        return ret;
    }
}