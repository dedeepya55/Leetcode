class Solution {
    public int minimumBuckets(String hamsters) {
        char[] ham = hamsters.toCharArray();
        int c = 0;
        for (int i = 0; i < ham.length; i++) {
            if (ham[i] == 'H') {
                if ((i > 0 && ham[i - 1] == 'B') || (i < ham.length - 1 && ham[i + 1] == 'B')) {
                    continue; 
                }
                if (i + 1 < ham.length && ham[i + 1] == '.') {
                    ham[i + 1] = 'B'; 
                    c++;
                } else if (i > 0 && ham[i - 1] == '.') {
                    ham[i - 1] = 'B'; 
                    c++;
                } else {
                    return -1; 
                }
            }
        }
        
        return c;
    }
}
