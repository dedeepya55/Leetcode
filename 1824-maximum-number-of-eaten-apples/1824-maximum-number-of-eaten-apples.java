class Solution {
    static class ApplePair implements Comparable<ApplePair>{
        int rotten;
        int numOfApples;
        public ApplePair(int rotten,int numOfApples){
            this.rotten=rotten;
            this.numOfApples=numOfApples;
        }
        @Override
        public int compareTo(ApplePair other){
            return Integer.compare(this.rotten,other.rotten);
        }
    }
    public int eatenApples(int[] apples, int[] days) {
       int n=apples.length;
       Queue<ApplePair> q=new PriorityQueue<>();
       int ans=0;
       for(int i=0;i<n||!q.isEmpty();i++){
            while(!q.isEmpty() && q.peek().rotten<=i){
                q.poll();
            }
            if(i<n && apples[i]>0){
                q.offer(new ApplePair(i+days[i],apples[i]));
            }
            if(!q.isEmpty()){
                int rotten=q.peek().rotten;
                int numOfApples=q.peek().numOfApples;
                if(numOfApples>1){
                    q.offer(new ApplePair(rotten,numOfApples-1));
                }
                q.poll();
                ans++;
            }
       }
       return ans;
    }
}