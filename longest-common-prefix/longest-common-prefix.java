class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;;
        String s="";
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        
        for(int i=0;i<strs.length;i++){
            min=Math.min(strs[i].length(),min);
        }
        for(int j=0;j<min;j++){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(j)!=strs[i+1].charAt(j)){
                    return s;
                }
                else if((strs[i].charAt(j)==strs[i+1].charAt(j))&&i==(strs.length-2)){
                    s+=strs[i].charAt(j);
                }
            }
        }
        
        return s;
    }
   
    
}