class Solution {
  public int minimumCost(int[] cost) {
    int ans = 0;
    Integer[] costt=new Integer[cost.length];
    for(int i=0;i<cost.length;i++){
        costt[i]=cost[i];
    }
    Arrays.sort(costt,Collections.reverseOrder());

    for (int i = 0; i < cost.length; ++i)
      if (i % 3 != 2)
        ans += costt[i];

    return ans;
  }
}