class Solution {
    public static List<Boolean> l;
    public static void Seive(int n) {
        l = new ArrayList<>(Collections.nCopies(n + 1, true)); 
        l.set(0, false);
        l.set(1, false);
        for(int i=2;i*i<=n;i++){
            if(l.get(i)){
                for(int j=i*i;j<=n;j+=i){
                    l.set(j,false);
                }
            }
        }
    }
    public int[] closestPrimes(int left, int right) {
        Seive(right);
        List<Integer> primes=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(l.get(i)){
                primes.add(i);
            }
        }
         int[] arr=new int[2];
        //  System.out.println(primes);
        if(primes.size()==0  || primes.size()==1){
            arr[0]=-1;
            arr[1]=-1;
        }
        else{
            int min=Integer.MAX_VALUE;
            int oo=0;int pp=0;
            for(int i=0;i<primes.size()-1;i++){
                if(min!=(primes.get(i+1)-primes.get(i)))
                {
                min=Math.min(min,(primes.get(i+1)-primes.get(i)));
                if(min==(primes.get(i+1)-primes.get(i))){
                    oo=primes.get(i);
                    pp=primes.get(i+1);
                }
                }
            }
            arr[0]=oo;
            arr[1]=pp;

        }
        return arr;
    }
}