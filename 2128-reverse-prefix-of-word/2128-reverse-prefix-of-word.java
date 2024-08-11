class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = new char[word.length()];
        int i;
        for (i = 0; i < word.length(); i++) {
            c[i] = word.charAt(i); 
            if (word.charAt(i) == ch) {
                break;
            }
        }
        if (i == word.length()) {
            return word;
        }
        String rs = "";
        for (int j = 0; j <= i; j++) {
            rs = c[j] + rs;
        }
        rs += word.substring(i + 1);

        return rs;
    }
}
