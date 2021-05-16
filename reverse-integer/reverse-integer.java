class Solution {
    public int reverse(int x) {
        
        long y;
        if(x<0){
            y=-x;
        }
        else{
            y=x;
        }
       
        long temp=0;
        
        while(y!=0){
            temp=temp*10+y%10;
            y=y/10;
        }
        y=temp;
        if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE){
            return 0;
        }
        
        return (x>0)?(int)y:-(int)y;
        
     
    }
}