class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]>  ans=new ArrayList<>();
        int i=0;
        int j=0;
       while(i<firstList.length && j<secondList.length){
            int lo=Math.max(firstList[i][0],secondList[j][0]);
            int hi=Math.min(firstList[i][1],secondList[j][1]);
            System.out.println(lo+" "+hi);
            if(lo<=hi){
                ans.add(new int[]{lo,hi});
            }
            if(firstList[i][1]<secondList[j][1]){
                    i++;
                }
                else{
                    j++;
                }
       }
       return ans.toArray(new int[ans.size()][]);
    }
}

