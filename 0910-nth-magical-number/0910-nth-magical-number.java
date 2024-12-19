class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm=(long) (a*b)/gcd(a,b);
        long l=1;
        long h=(long)Math.min(a,b)*n;
        while(l<h){
            long mid=(l+h)/2;
            long cnt=(mid/a)+(mid/b)-(mid/lcm);
           if(cnt<n){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        long MOD = 1000000007;
        System.out.println(l%MOD);
        return (int)(l%MOD);
    }
}