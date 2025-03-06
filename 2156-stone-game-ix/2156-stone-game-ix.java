class Solution {
    public boolean stoneGameIX(int[] stones) {
      int[] c=new int[3];
      Arrays.fill(c,0);
      for(int i:stones){
        if(i%3==0){
            c[0]++;
        }
        else if(i%3==1){
            c[1]++;
        }
        else{
            c[2]++;
        }
      }
      if(c[0]%2==0){
        return Math.min(c[1],c[2])>0;
      }
      return Math.abs(c[1]-c[2])>2;
    }
}