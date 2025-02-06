class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1){
            if(gas[0]<cost[0]) return -1;
        }
        int sum=0;
        int checked=0;
        int l=cost.length-1;
        int r=cost.length-1;
        while(checked<gas.length){
            sum+=gas[l]-cost[l];
            checked++;
            l=(l+1)%gas.length;
            System.out.println(checked);
            while(sum<0 && checked<gas.length){
                r--;
                sum+=gas[r]-cost[r];
                checked++;
            }
        }
        // System.out.println(r);
        return sum>=0?r:-1;
    }
}