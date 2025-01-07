class Solution {
    public static boolean kmp(String txt,String pat){
        List<Integer> l=new ArrayList<>();
        lps(pat,l);
        int i=0;
        int j=0;
        while(i<txt.length() ){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==pat.length()){
                    return true;
                }
            }
            else{
                if(j!=0){
                j=l.get(j-1);
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
    public static void lps(String pat,List<Integer> l){
        int len=0;
        l.add(0);
        int i=1;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                l.add(len);
                i++;
            }
            else{
                if(len!=0){
                    len=l.get(len-1);
                }
                else{
                    l.add(0);
                    i++;
                }
            }
        }
    }
    public List<String> stringMatching(String[] words) {
        Set<String> l=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].length()>=words[j].length()){
                    if(kmp(words[i],words[j])){
                        l.add(words[j]);
                        continue;
                    }
                }
            }
        }
        return new ArrayList<>(l);
    }
}