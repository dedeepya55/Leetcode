class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr=new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            int c=s2.charAt(i)-'a';
            arr[c]+=1;
            int d=s1.charAt(i)-'a';
            arr[d]-=1;
        }
        int co=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                co+=1;
            }
        }
        if(co==0){
            return true;
        }
        for(int i=s1.length();i<s2.length();i++){
            int c=s2.charAt(i-s1.length())-'a';
            int d=s2.charAt(i)-'a';
            if(arr[d]==0){
                co+=1;
            }
            arr[d]+=1;
            if(arr[d]==0){
                co-=1;
            }
            if(arr[c]==0){
                co+=1;
            }
            arr[c]-=1;
            if(arr[c]==0){
                co-=1;
            }
            if(co==0){
                return true;
            }
        }
        return false;
       
    }
}