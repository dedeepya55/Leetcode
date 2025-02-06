class Solution {
    public int trap(int[] height) {
        int[] p=new int[height.length];
        int[] s=new int[height.length];
        p[0]=height[0]; s[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            if(p[i-1]<height[i]){
                p[i]=height[i];
            }
            else{
                p[i]=p[i-1];
            }
        }
        for(int i=height.length-2;i>=0;i--){
            if(s[i+1]<height[i]){
                s[i]=height[i];
            }
            else{
                s[i]=s[i+1];
            }
        }
        for(int i=0;i<height.length;i++){
            p[i]=Math.min(p[i],s[i]);
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.abs(p[i]-height[i]);
        }
        return sum;
    }
}