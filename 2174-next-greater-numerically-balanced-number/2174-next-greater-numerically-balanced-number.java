class Solution {
    public int nextBeautifulNumber(int n) {
        n=n+1;
        while(!balance(n)){
            n=n+1;
            // System.out.println(n);
        }
        return n;
    }
    public boolean balance(int n){
        Map<Integer,Integer> m=new HashMap<>();
        while(n>0){
            if(n%10==0){
                return false;
            }
            else{
                m.put(n%10,m.getOrDefault(n%10,0)+1);
            }
            n=n/10;
        }
        for(Map.Entry<Integer,Integer> ele:m.entrySet()){
            if(ele.getKey()!=ele.getValue()){
                return false;
            }
        }
        return true;
    }
}