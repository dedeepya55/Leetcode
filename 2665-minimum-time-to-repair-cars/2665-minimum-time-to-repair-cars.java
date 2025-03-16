class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=0;
        long r=Integer.MAX_VALUE;
        for(int i=0;i<ranks.length;i++){
            r=Math.min(r,ranks[i]);
        }
        r=r*cars*cars;
        while(l<r){
            long mid=(l+r)/2;
            if(NumberOfcarsRepaired(ranks,mid)>=cars){
                r=mid;
                // l=mid-1;
            }
            else{
                l=mid+1;
                // r=mid;
            }
        }
        return l;
    }
    public long NumberOfcarsRepaired(int[] ranks,long mid){
        long carsRepaired=0;
        for(int i:ranks){
            carsRepaired+=Math.sqrt(mid/i);
        }
        System.out.println( carsRepaired+" "+mid);
        return carsRepaired;
    }
}