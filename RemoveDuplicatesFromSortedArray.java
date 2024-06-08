import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray {
    
    public RemoveDuplicatesFromSortedArray(){
    }
    public int remove(int[] nums){
        if(nums.length==0||nums.length>=30000)
            return -1;
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int[] num=new int[sortedNums.length];
        num[0]=sortedNums[0];
        int k=1,x;
        boolean duplicate=false;
        for(int i=1;i<sortedNums.length;i++){
            for(int s:num){
                if(sortedNums[i]==s){
                    duplicate=true;
                    break;
                }
                if(duplicate==true)
                    break;
            }
            if(duplicate!=true){
                num[k]=sortedNums[i];
                k++;}
            duplicate=false;
        }
        x=k;
        while(x<sortedNums.length){
            num[x]=-1;
            x++;
        }
        nums=num.clone();
        return k;
    }
    
}
