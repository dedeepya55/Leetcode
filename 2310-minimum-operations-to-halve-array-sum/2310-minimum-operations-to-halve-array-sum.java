class Solution {
    public int halveArray(int[] nums) {
      PriorityQueue<Double> q=new PriorityQueue<Double>(Collections.reverseOrder());
        double sum=0;
      for(int i=0;i<nums.length;i++){
        q.offer((double)nums[i]);
        sum+=nums[i];
      }
      double half=sum/2.0;
        int op=0;
      while(sum>half){
            double l=q.poll()/2.0;
            sum=sum-l;
            q.offer(l);
            op++;
      }
      return op;
    }
}