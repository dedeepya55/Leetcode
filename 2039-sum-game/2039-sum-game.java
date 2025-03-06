class Solution {
    public boolean sumGame(String num) {
        int qL=0,qR=0;
        int sL=0,sR=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?'){
                qL++;
            }
            else{
                sL+=(int)num.charAt(i)-'0';
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?'){
                qR++;
            }
            else{
                sR+=(int) num.charAt(i)-'0';
            }
        }
        boolean ans1=((qL+qR)%2==1);
        boolean ans2=((sL-sR)!=9*(qR-qL)/2);
        return ans1||ans2;
    }
}