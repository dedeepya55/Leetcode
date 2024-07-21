class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int totalVowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                return true;
            }
        }
      return false;
    }
}
