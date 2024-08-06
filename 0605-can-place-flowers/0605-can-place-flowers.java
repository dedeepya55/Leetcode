class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n==1){
                return true;
            }
            if(n==0){
                return true;
            }
            else{
                return false;
            }
        }
        for (int i = 0; i < flowerbed.length; i++) {
            
            if (i == 0 && flowerbed.length > 1) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1;
                }
            }
            else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1; 
                }
            }
            else if (flowerbed[i] == 0) {
                if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1; 
                    i++;
                }}
            else {
                c = 0;
            }
        }
        return n <= 0;
    }
}
