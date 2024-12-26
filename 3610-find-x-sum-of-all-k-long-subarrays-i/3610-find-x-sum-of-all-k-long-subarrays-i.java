class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            Map<Integer,Integer> m=new HashMap<>();
            for(int j=i;j<i+k;j++){
                m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            }
            PriorityQueue<int[]> q=new PriorityQueue<>((a,b) -> {
                if(b[1]==a[1]){
                    return b[0]-a[0];
                }
                return b[1]-a[1];
            });
            for(Map.Entry<Integer,Integer> ele:m.entrySet()){
                q.add(new int[] {ele.getKey(),ele.getValue()});
            }
            int sum=0;
            for(int j=0;j<x && !q.isEmpty();j++){
                int[] a=q.poll();
                sum+=a[0]*a[1];
            }
            ans.add(sum);
        }
        int[] ar=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ar[i]=ans.get(i);
        }
        return ar;
    }
}