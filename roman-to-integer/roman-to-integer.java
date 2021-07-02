class Solution {
    public int romanToInt(String s) {
        Stack<Character> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            int x=stack.pop();
            if(stack.isEmpty()){
                if(x=='V'){
                    sum+=5;
                }
                if(x=='I'){
                    sum+=1;
                }
                if(x=='X'){
                    sum+=10;
                }
                if(x=='L'){
                    sum+=50;
                }
                if(x=='C'){
                    sum+=100;
                }
                if(x=='D'){
                    sum+=500;
                }
                if(x=='M'){
                    sum+=1000;
                }
            }
            else{
                if(x=='V'&&stack.peek()!='I'){
                sum+=5;
            }
            else if(x=='V'&&stack.peek()=='I'){
                sum+=4;
                stack.pop();
            }
            else if(x=='X'&&stack.peek()=='I'){
                sum+=9;
                stack.pop();
            }
            else if(x=='X'&&stack.peek()!='I'){
                sum+=10;
                
            }
            else if(x=='L'&&stack.peek()=='X'){
                sum+=40;
                stack.pop();
                
            }
            else if(x=='L'&&stack.peek()!='X'){
                sum+=50;
                
            }
            else if(x=='C'&&stack.peek()=='X'){
                sum+=90;
                stack.pop();
                
            }
            else if(x=='C'&&stack.peek()!='X'){
                sum+=100;
                
            }
            else if(x=='D'&&stack.peek()=='C'){
                sum+=400;
                stack.pop();
                
            }
            else if(x=='D'&&stack.peek()!='C'){
                sum+=500;
                
            }
            else if(x=='M'&&stack.peek()=='C'){
                sum+=900;
                stack.pop();
                
            }
            else if(x=='M'&&stack.peek()!='C'){
                sum+=1000;;
                
            }
            else if(x=='I'){
                sum+=1;
            }
                
            }
            
            
        }
        return sum;
    }
}