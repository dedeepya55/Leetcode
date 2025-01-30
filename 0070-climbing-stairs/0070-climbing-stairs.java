import java.util.Arrays;
class Solution {
    public int[] arr=new int[46];
    public Solution() { 
        Arrays.fill(arr, 0);  
    }
    public int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(arr[n]!=0) return arr[n];
        int left=climbStairs(n-1);
        int right=climbStairs(n-2);
        arr[n]=left+right;
        return arr[n];
    }
}