class Solution {
    public boolean isSub(String a,String b){
        int i=0;
        for(char c:b.toCharArray()){
            if(i<a.length() && a.charAt(i)==c){
                i++;
            }
        }
        return i==a.length();
    }
    public int findLUSlength(String[] strs) {
        Set<String> seen=new HashSet<>();
        Set<String> dup=new HashSet<>();
        for(String x:strs){
            if(seen.contains(x)){
                dup.add(x);
            }
            else{
                seen.add(x);
            }
        }
        Arrays.sort(strs,(a,b) -> b.length()-a.length());
        for(int i=0;i<strs.length;i++){
            if(dup.contains(strs[i])){
                continue;
            }
            boolean isASub=false;
            for(int j=0;j<i;j++){
                isASub|=isSub(strs[i],strs[j]);
            }
            if(!isASub){
                return strs[i].length();
            }
        }
        return -1;
    }
}
