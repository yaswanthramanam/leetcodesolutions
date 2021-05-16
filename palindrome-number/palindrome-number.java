class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int start=0;
        String str=Integer.toString(x);
        int end=(str).length()-1;
        
        while(start<=end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
    
}