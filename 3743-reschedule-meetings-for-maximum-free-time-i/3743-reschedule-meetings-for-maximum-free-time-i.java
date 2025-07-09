class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        List<Integer> l=new ArrayList<>();
        if(startTime[0]!=0){
            l.add(startTime[0]-0);
        }

        for(int i=0;i<startTime.length-1;i++){
            l.add(startTime[i+1]-endTime[i]);
        }

        if(endTime[endTime.length-1]!=eventTime){
            l.add(eventTime-endTime[endTime.length-1]);
        }

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        int sum=0;
        int maxSum=0;
        if(k>=l.size()){
            k=l.size()-1;
        }
        for(int i=0;i<=k;i++){
            sum+=l.get(i);
            maxSum=Math.max(sum,maxSum);
            System.out.println(sum+" "+maxSum);
        }
        for(int i=k+1;i<l.size();i++){
            sum-=l.get(i-k-1);
            sum+=l.get(i);
            System.out.println(l.get(i)+" "+l.get(i-k-1));
            maxSum=Math.max(sum,maxSum);
            System.out.println(sum+" "+maxSum);
        }
        return maxSum;
    }
}