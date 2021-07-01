class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length()-1;
        int l2=num2.length()-1;
        int carry=0;
        StringBuilder str=new StringBuilder();
        
        while(l1>=0||l2>=0){
            int sum=carry;
            
            if(l1>=0){
                sum+=num1.charAt(l1--)-'0';
                
            }
            if(l2>=0){
                sum+=num2.charAt(l2--)-'0';
            }
            str.append(sum%10);
            carry=sum/10;
            
        }
        if(carry!=0){
            str.append(carry);
        }
       return str.reverse().toString();
        
    }
}