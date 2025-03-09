class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int ans=0;
        int a=1;
        for(int i=0;i<n+k-2;i++){
            if(colors[i%n]==colors[(i-1+n)%n]){
                a=1;
            }
            else{
                a=a+1;
            }
            if(a>=k) ans++;
        }
        return ans;
    }
}