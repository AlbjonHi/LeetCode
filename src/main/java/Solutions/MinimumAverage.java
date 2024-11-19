package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;

/*
You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.

You repeat the following procedure n / 2 times:

Remove the smallest element, minElement, and the largest element maxElement, from nums.
Add (minElement + maxElement) / 2 to averages.
Return the minimum element in averages.
 */
public class MinimumAverage {
    
    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));
    }
    public static double minimumAverage(int[] nums) {
        double[] averages=new double[nums.length/2];
        int min;
        int max;
        List<Integer> reducedList=new ArrayList<>();
        boolean minRemoved=false;
        boolean maxRemoved=false;
        while (nums.length!=0){
            for(int x=0;x<averages.length;x++) {
                min=Arrays.stream(nums).min().orElseThrow();
                max= Arrays.stream(nums).max().orElseThrow();
                averages[x] = (double)(min+max) / 2;
                for(int num: nums){
                    if(num==min && !minRemoved){
                        minRemoved=true;
                    }
                    else if(num==max && !maxRemoved){
                        maxRemoved=true;
                    }else {
                        reducedList.add(num);
                    }
                }
                minRemoved=false;
                maxRemoved=false;
                nums=reducedList.stream().mapToInt(Integer:: intValue).toArray();
                reducedList.clear();
            }
        }
        return Arrays.stream(averages).min().orElseThrow();
    }
}
