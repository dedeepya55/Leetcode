class Solution {
    public int hIndex(int[] citations) {
        int[] counts = new int[citations.length+2];

        for(int i=citations.length-1;i>=0;i--){
            counts[Math.min(citations[i],citations.length)]++;
        }
        // for(int i=0;i<counts.length;i++){
        //     System.out.println(counts[i]);
        // }
        int i;
        for(i=citations.length;i>0;i--){
            counts[i]+=counts[i+1];
            if(counts[i]>=i) break;

        }
        return i;
    }
}