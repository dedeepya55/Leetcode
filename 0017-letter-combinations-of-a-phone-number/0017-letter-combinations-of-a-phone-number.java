class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> l=new ArrayList<>();
        l.add("");
        String[] di={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(char c:digits.toCharArray()){
            List<String> tmp=new ArrayList<>();
            for(String s:l){
                int i=0;
                for(char c1:di[c-'0'].toCharArray()){
                    tmp.add(s+c1);
                }
            }
            l=tmp;
        }
        return l;
    }
}