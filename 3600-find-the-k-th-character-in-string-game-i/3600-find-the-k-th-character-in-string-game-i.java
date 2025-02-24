class Solution {
    public char kthCharacter(int k) {
        int l1=Integer.bitCount(k-1);
        if(l1>26){
            l1=l1%26;
        }
        // System.out.println(l1);
        int ans=97+l1;
        // System.out.println((char) 98);
        return (char) ans;
    }
}