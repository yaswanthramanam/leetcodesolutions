class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(stack1.isEmpty()){
                    continue;
                }
                else{
                    stack1.pop();
                }
            }
            else{
                stack1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(stack2.isEmpty()){
                    continue;
                }
                else{
                    stack2.pop();
                }
            }
            else{
                stack2.push(t.charAt(i));
            }
        }
        String str1="";
        String str2="";
        while(!stack1.isEmpty()){
            str1=stack1.pop()+str1;
        }
        while(!stack2.isEmpty()){
            str2=stack2.pop()+str2;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}