class Solution {
    public int maxSubArray(int[] nums){
        int sum=0;
        int sum1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            
            if(sum1<sum){
                sum1=sum;
            }
        }
        
        
        
       return sum1; 
    }
}