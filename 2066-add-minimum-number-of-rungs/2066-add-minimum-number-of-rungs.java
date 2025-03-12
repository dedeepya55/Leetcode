class Solution {
    public int addRungs(int[] rungs, int dist) {
        int[] diff=new int[rungs.length];
        int start=0;
        for(int i=0;i<rungs.length;i++){
            diff[i]=rungs[i]-start;
            start=rungs[i];
        }
        int cnt=0;
       for(int i=0;i<diff.length;i++){
           if(diff[i]>dist){
            cnt+=(diff[i]-1)/dist;
           } 
        }
        return cnt;
    }
}