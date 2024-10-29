class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        StringBuilder st=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                st.append(a.charAt(i));
            }
            else{
                break;
            }
        }
        return st.toString();
    }
}