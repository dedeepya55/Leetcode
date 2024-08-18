class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        
         long c=energyDrinkA[0];
         long d=energyDrinkB[0];
        for(int i=1;i<energyDrinkA.length;i++){
            long cc=c;
            long dd=d;
            c=Math.max(cc+energyDrinkA[i],dd);
            d=Math.max(dd+energyDrinkB[i],cc);
        }
        return Math.max(c,d);
    }
}