class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s=new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=getSquares(n);
        }
        if(n==1)return true;
        return false;
    }
    private int getSquares(int n){
        int s=0;int m;int sum=0;
        while(n>0){
            m=n%10;
            sum+=Math.pow(m,2);
            n=n/10;
        }
        return sum;
    }
}