class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> stack=new LinkedList<>();
        int len1=1;
        int len2=1;
        if(s.length()==0||s.length()==1){
            return s.length();
        }
        stack.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            while(stack.contains(s.charAt(i))){
                if(stack.size()>len2)len2=stack.size();
                stack.remove();
            }
            
                stack.add(s.charAt(i));
                
            
            
            
        }
        if(stack.size()>len2){
            len2=stack.size();
        }
        return len2;
    }
}