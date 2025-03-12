class Solution {
    public long numberOfWeeks(int[] milestones) {
        Arrays.sort(milestones);
        long cnt=0;
        long m=milestones[0];
        for(int i=0;i<milestones.length;i++){
            cnt+=milestones[i];
            if(m<milestones[i]){
                m=milestones[i];
            }
        }
        long r=cnt-m;
        return Math.min(cnt,2*r+1);
    }
}