class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder s = new StringBuilder(num);
        boolean started = false;

        for (int i = 0; i < num.length(); i++) {
            int k = num.charAt(i) - '0';

            if (change[k] > k) {  
                s.setCharAt(i, (char) (change[k] + '0'));
                started = true;
            } 
            else if (change[k] < k && started) {
                break;
            }
        }
        return s.toString();
    }
}
