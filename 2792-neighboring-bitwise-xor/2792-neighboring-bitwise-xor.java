class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int s=0;
        for(int x:derived){
            s=s^x;
        }
        if(s==0){
            return true;
        }
        else return false;
    }
}