class Solution {
    public int titleToNumber(String columnTitle) {
        int k=columnTitle.length();int u=k-1;
        int i=0;int c=0;
        while(i!=k){
            int h=(int) columnTitle.charAt(i)-64;
            System.out.println(h);
            c+=h*Math.pow(26,u);
            u=u-1;
            i=i+1;
        }
        return c;
    }
}