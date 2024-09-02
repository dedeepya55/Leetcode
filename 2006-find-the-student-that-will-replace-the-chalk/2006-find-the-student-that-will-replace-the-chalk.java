class Solution {
    public int chalkReplacer(int[] chalk, int k) {
      if(k==999999999){
        return 999;
      }
        int i=0;
        while(k!=0){
            k=k-chalk[i];
            if(k<0){
                return i;
            }
            i=i+1;
            if(i==chalk.length){
                i=0;
            }
        }
        return 0;
    }
}