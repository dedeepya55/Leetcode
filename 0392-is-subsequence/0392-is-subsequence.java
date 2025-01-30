class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // Move pointer in `s` when there's a match
            }
            j++;  // Always move pointer in `t`
        }

        return i == s.length(); // `s` is a subsequence if we matched all characters
    }
}
