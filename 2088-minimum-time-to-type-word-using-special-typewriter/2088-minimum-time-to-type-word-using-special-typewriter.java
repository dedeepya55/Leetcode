class Solution {
    public int minTimeToType(String word) {
        char letter='a';
        int count=0;
        for(char c:word.toCharArray()){
            int a=Math.abs(c-letter);
            int b=Math.min(a,26-a);
            letter=c;
            count+=b;
        }
        return count+word.length();
    }
}