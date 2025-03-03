class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        
        char firstMaxDigit = ' ';
        String maxStr = numStr;
        for (char c : numStr.toCharArray()) {
            if (c != '9') {
                firstMaxDigit = c;
                maxStr = numStr.replace(firstMaxDigit, '9');
                break;
            }
        }
        char firstMinDigit = numStr.charAt(0);
        String minStr = numStr.replace(firstMinDigit, '0');
        int maxNum = Integer.parseInt(maxStr);
        int minNum = Integer.parseInt(minStr);
        
        return maxNum - minNum;
    }
}
