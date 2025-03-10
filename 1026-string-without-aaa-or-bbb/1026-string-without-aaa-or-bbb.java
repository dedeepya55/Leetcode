class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder s = new StringBuilder();
        
        while (a > 0 || b > 0) {
            boolean writeA = false;
            int len = s.length();
            
            if (len >= 2 && s.charAt(len - 1) == s.charAt(len - 2)) {
            
                writeA = s.charAt(len - 1) == 'b';
            } else {
                writeA = a >= b;
            }

            if (writeA) {
                s.append('a');
                a--;
            } else {
                s.append('b');
                b--;
            }
        }
        
        return s.toString();
    }
}
