class Solution {
    public int reverse(int x) {
        List<Integer> l=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int h=0;
        if(x<0){
            h=-1;
            x=x*-1;
        }
        int k=0;
        while(x>0){
            int n=x%10;
             if (k > (Integer.MAX_VALUE - n) / 10) {
                return 0;  
            }
            k=k*10+n;
            x=x/10;
        }
        if(h==0){
            return k;
        }
        else{
            return h*k;
        }
    }
}