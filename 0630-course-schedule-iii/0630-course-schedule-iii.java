class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(course1,course2)->course1[1]-course2[1]);

        PriorityQueue<Integer> q=new PriorityQueue<>((duration1, duration2) -> duration2 - duration1);

        int cnt=0;

        for(int[] course:courses){
            int duration=course[0];
            int lastDay=course[1];
            
            cnt+=duration;

            q.offer(duration);

            while(cnt>lastDay){
                int poppedDuration=q.poll();
                cnt-=poppedDuration;
            }
        }
        return q.size();
    }
}