package Solutions;

/*
You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.
 */

public class ArithmeticTriplets {
    
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
    }
    
    public static int arithmeticTriplets(int[] nums, int diff) {
        int triplets = 0;
        int left = 0;
        int right = nums.length - 1;
        int flag;
        for (left = 0; left < right; left++) {
            for (right = nums.length - 1; right > left; right--) {
                if (nums[right] - nums[left] == diff) {
                    flag = right;
                    while (right < nums.length - 1) {
                        if (nums[right + 1] - nums[flag] == diff) {
                            triplets++;
                            break;
                        } else
                            right++;
                    }
                    right = flag;
                }
            }
            right = nums.length - 1;
            
        }
        return triplets;
    }
}
