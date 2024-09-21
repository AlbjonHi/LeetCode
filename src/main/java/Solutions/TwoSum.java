package Solutions;

public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int [] out=new int[2];
        for(int l=0;l<nums.length;l++){
            for(int i=1;i<nums.length;i++) {
                if(l!=i)
                    if (nums[l] + nums[i] == target) {
                        out[0] = l;
                        out[1] = i;
                        return out;
                    }
            }
        }
        return null;
    }
}
