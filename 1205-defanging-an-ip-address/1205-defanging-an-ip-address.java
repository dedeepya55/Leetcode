class Solution {
    public String defangIPaddr(String address) {
        char[] r = new char[address.length() + 6]; 
        int i = 0, j = 0;
        while (i < address.length()) { 
            if (address.charAt(i) == '.') {
                r[j] = '[';
                r[j + 1] = '.';
                r[j + 2] = ']';
                j += 3;
            } else {
                r[j] = address.charAt(i);
                j++;  
            }
            i++;
        }
        return new String(r); 
    }
}
