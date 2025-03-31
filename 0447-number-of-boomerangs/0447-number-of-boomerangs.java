class Solution {
    public int numberOfBoomerangs(int[][] points) {
       int ans=0;
       for(int[] point1:points){
        Map<Integer,Integer> map=new HashMap<>();
        for(int[] point2:points){
            int dist = (int)getDist(point1,point2);
            map.put(dist,map.getOrDefault(dist,0)+1);
        }
        for(int freq : map.values()){
            ans+=freq*(freq-1);
        }
       }
       return ans;
    }
    public double getDist(int[] p,int[] q){
        return Math.pow(p[0]-q[0],2)+Math.pow(p[1]-q[1],2);
    }
}
