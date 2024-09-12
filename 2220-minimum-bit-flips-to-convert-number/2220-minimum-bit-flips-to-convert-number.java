class Solution {
    public int minBitFlips(int start, int goal) {
        int[] sb=new int[32];
        int i=0;
        while(start>0){
            sb[i]=start%2;
            System.out.print(sb[i]+" ");
            start=start/2;
            i++;
        }
        int[] gb=new int[32];
        int j=0;
        System.out.println();
        while(goal>0){
            gb[j]=goal%2;
             System.out.print(gb[i]+" ");
            goal=goal/2;
            j++;
        }
        int c=0;
         System.out.println();
        for(int k=0;k<32;k++){
            if(sb[k]!=gb[k]){
                System.out.print(k);
                // System.out.print();
                 System.out.println();
                c++;
            }
        }
        return c;
    }
}