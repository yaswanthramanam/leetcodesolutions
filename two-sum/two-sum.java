class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int j=0;j<nums.length-1;j++){
        for(int i=j+1;i<nums.length;i++){
            if((target-nums[j])==nums[i]){
                return new int[]{j,i};
            }
            
            
              
        }
        }
        return new int[]{0,0};
        
        
    }
}