class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(m.containsKey(ransomNote.charAt(i))){
                int h=m.get(ransomNote.charAt(i));
                if(!(h>=1)){
                    return false;
                }
                else{
                    m.put(ransomNote.charAt(i),(h-1));
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}