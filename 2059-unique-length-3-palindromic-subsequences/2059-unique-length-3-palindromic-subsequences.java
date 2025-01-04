class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int result = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c); 

            if (first != -1 && last != -1 && last - first > 1) {
                Set<Character> uniqueMiddleChars = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    uniqueMiddleChars.add(s.charAt(i));
                }
                result += uniqueMiddleChars.size();
            }
        }

        return result;
    }
}