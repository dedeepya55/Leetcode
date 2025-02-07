class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] intervals1=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            intervals1[i][0]=intervals[i][0];
            intervals1[i][1]=intervals[i][1];
        }
        intervals1[intervals.length][0]=newInterval[0];
        intervals1[intervals.length][1]=newInterval[1];
         Arrays.sort(intervals1,(a,b)->Integer.compare(a[0],b[0]));
        // if(intervals.length==1){
        //     return intervals;
        // }
         List<int[]> merged = new ArrayList<>();
        int start = intervals1[0][0];
        int end = intervals1[0][1];
        for(int i=0;i<intervals1.length;i++){
                System.out.println(intervals1[i][0]+" "+intervals1[i][1]);
        }
        // System.out.println(start+" "+end);
        for(int i=1;i<intervals1.length;i++){
             if (intervals1[i][0] <= end) { 
                end = Math.max(end, intervals1[i][1]); 
            }
             else { 
                merged.add(new int[]{start, end});
                start = intervals1[i][0];
                end = intervals1[i][1];
            }
        }
         merged.add(new int[]{start, end});
        return merged.toArray(new int[merged.size()][]);
    }
}