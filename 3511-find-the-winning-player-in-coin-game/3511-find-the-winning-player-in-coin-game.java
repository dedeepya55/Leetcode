class Solution {
    public String winningPlayer(int x, int y) {
        int ans=0;
       while(x>0 && y>3){
            x=x-1;
            y=y-4;
            ans++;
       }
       if(ans==1){
        return "Alice";
       }
       if(ans%2!=0){
        return "Alice";
       }
       return "Bob";
    }
}