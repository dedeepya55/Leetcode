class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert the string to its corresponding numeric representation
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            s1.append(s.charAt(i) - 'a' + 1);
        }
        
        // Step 2: Sum the digits of the numeric string representation k times
        String s2 = s1.toString();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char c : s2.toCharArray()) {
                sum += c - '0';  // Calculate the sum of digits
            }
            s2 = String.valueOf(sum);  // Convert the sum back to a string
        }

        return sum;
    }
}
