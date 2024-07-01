class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        else{
            int k=x;
            int n=0,s=0;
            while(x!=0)
            {
                n=x%10;
                s=s*10+n;
                x=x/10;
            }
           return s==k;
        }
    }
}