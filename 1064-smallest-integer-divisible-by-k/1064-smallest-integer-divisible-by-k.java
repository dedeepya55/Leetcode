class Solution {
    public int smallestRepunitDivByK(int k) {
        int n=0;
        if(k%10!=1 && k%10!=7 && k%10!=3 && k%10!=9){
            // System.out.println(n%10);
            return -1;
        }
        Set<Integer> s=new HashSet<>();
        for(int i=1;i<=k;i++){
            n=(n*10+1)%k;
            System.out.println(n);
            if(n==0){
                return (i);
            }
            if(s.contains(n)){
                // System.out.println(s.contains(n));
                return -1;
            }
            s.add(n);
        }
        return -1;
    }
}