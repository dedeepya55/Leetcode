class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxSubsetFreq = new int[26];
        for (String word : words2) {
            int[] tempFreq = new int[26];
            for (char ch : word.toCharArray()) {
                tempFreq[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxSubsetFreq[i] = Math.max(maxSubsetFreq[i], tempFreq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words1) {
            int[] wordFreq = new int[26];
            for (char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < maxSubsetFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }
}