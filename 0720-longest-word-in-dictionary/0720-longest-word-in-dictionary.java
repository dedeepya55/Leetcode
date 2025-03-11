class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words,(a,b) -> a.length()-b.length());
        Map<String,Boolean> wo=new HashMap<>();
        int m=0;
        String ans="";
        for(String w:words){
            if(w.length()==1){
                wo.put(w,true);
            }
            else if(wo.containsKey(w.substring(0,w.length()-1))){
                wo.put(w,true);
            }
            if(wo.containsKey(w)){
                if(m<w.length()){
                    m=w.length();
                    ans=w;
                }
                else if(m==w.length() && ans.compareTo(w)>0){
                    ans=w;
                }
            }
        }
        return ans;
    }
}