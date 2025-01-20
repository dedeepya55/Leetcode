class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a=0;
        int b=0;
        int cnt1=0,cnt2=0;
        for(int i:nums){
            if(a==i){
                cnt1++;
            }
            else if(b==i){
                cnt2++;
            }
            else if(cnt1==0){
                a=i;
                cnt1++;
            }
            else if(cnt2==0){
                b=i;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int cnto1=0,cnto2=0;
        for(int i:nums){
            if(a==i){
                cnto1++;
            }
            else if(b==i){cnto2++;}
        }
        List<Integer> l=new ArrayList<>();
        if(cnto1>(nums.length/3)){
            l.add(a);
        }
        if(cnto2>(nums.length/3)){
            l.add(b);
        }
        return l;
    }
}