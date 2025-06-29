class Solution {
    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] lcp = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            lcp[i] = getLcpLength(words[i], words[i + 1]);
        }

        int[] prefixMax = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (i == 0) {
                prefixMax[i] = lcp[i];
            } else {
                prefixMax[i] = Math.max(prefixMax[i - 1], lcp[i]);
            }
        }

        int[] suffixMax = new int[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (i == n - 2) {
                suffixMax[i] = lcp[i];
            } else {
                suffixMax[i] = Math.max(suffixMax[i + 1], lcp[i]);
            }
        }
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int maxLcp = 0;

            if (i > 0 && i < n - 1) {
                maxLcp = getLcpLength(words[i - 1], words[i + 1]);
            }
            if (i >= 2) {
                maxLcp = Math.max(maxLcp, prefixMax[i - 2]);
            }
            if (i <= n - 3) {
                maxLcp = Math.max(maxLcp, suffixMax[i + 1]);
            }

            answer[i] = maxLcp;
        }

        return answer;
    }

    private int getLcpLength(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return i;
            }
        }
        return len;
    }
}
