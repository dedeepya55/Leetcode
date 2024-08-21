class Solution {
    public boolean judgeSquareSum(int c) {
       for(long i=0;i<=c;i++){
        double number=Math.sqrt(c-(i*i));
        double dp=number-(long) number;
        if(dp==0){
            if((i*i)+(c-(i*i))==c){
                return true;
            }
        }
        if(i*i>c){
            break;
        }
       }
       return false;
    }
}