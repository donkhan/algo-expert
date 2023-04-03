package algo;

public class ZeroSumSubArray {

    public boolean zeroSumSubarray(int[] nums) {
        // Write your code here.
        for(int i = 0;i<nums.length;i++){
            int sum = nums[i];
            for(int j = i+1; j<nums.length;j++){
                sum = sum + nums[j];
                if(sum == 0) return true;
            }
            if(sum == 0) return true;
        }
        return false;
    }

    public static void main(String args[]){
        //int array[] = {-5,-5,2,3,-2};
        //int array[] = { 0 };
        int array[] = { 1,2,3,4,0,5,6,7 };

        System.out.println(new ZeroSumSubArray().zeroSumSubarray(array));
    }

}
