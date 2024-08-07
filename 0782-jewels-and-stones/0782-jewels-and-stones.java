class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> j=new HashSet<>();
        for(char i:jewels.toCharArray()){
            j.add(i);
        }
        int c=0;
        for(char i:stones.toCharArray()){
            if(j.contains(i)){
                c++;
            }
        }
        return c;
    }
}