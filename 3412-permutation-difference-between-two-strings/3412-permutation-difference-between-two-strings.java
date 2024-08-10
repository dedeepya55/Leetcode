class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            c.put(t.charAt(i), i);
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (c.containsKey(ch)) {
                int j = c.get(ch);
                count += Math.abs(i - j);
            }
        }
        
        return count;
    }
}
