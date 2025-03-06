class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]); 
            }
        });
        int start=intervals[0][0];
        int end=intervals[0][1];
        int overlaps=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=end){
                end=intervals[i][1];
            }
            else{
                overlaps++;
            }
        }
        return overlaps;
    }
}