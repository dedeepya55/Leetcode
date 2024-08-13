class Solution {
    public String firstPalindrome(String[] words) {
        for(String i: words)
        {
            int j=0;
            int k=i.length()-1;
            boolean pal=true;
            while(j<k){
                if(i.charAt(j)!=i.charAt(k)){
                    pal=false;
                    break;
                }
                j++;k--;
            }
            if(pal){
                return i;
            }
        }
        return "";
    }
}