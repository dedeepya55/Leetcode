class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         Set<Character> a = new HashSet<>();
        for (char i : allowed.toCharArray()) {
            a.add(i);
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean yes=true;
            for(int j=0;j<words[i].length();j++){
                if(!a.contains(words[i].charAt(j))){
                    yes=false;
                    break;
                }
            }
            if(yes){
                c++;
            }
        }
        return c;
    }
}