class Solution {

     static int sum(int[] nums, int left, int right){
        int sum = 0;
        for(int i = left ; i <= right; i++){
            sum += nums[i];
        }

        return sum;
    }
      
  public  int maxSubArray(int[] nums) {
        int currentSum =nums[0] ;
        int max = nums[0];
        int left = 0;
        int right = 0;
        int currentMax = max;

        

        while(right < nums.length -1 ){
            ++right;

            currentSum += nums[right];           
         



        
            if (currentSum > max) {
                currentMax = currentSum;
            }
            if (nums[right] > currentSum ) {
                left = right;
                currentSum = sum(nums, left, right);
                currentMax = currentSum;
            }

        
            if(currentMax > max){
                max = currentMax;
            }
       
        


    }

        

        return max;
    }

}
