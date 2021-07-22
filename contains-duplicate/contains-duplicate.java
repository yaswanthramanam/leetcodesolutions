class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> yash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(yash.contains(nums[i])){
                return true;
            }
            yash.add(nums[i]);
        }
        
       return false; 
    }
}