class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles;
        int b=numExchange;
        int c=numBottles;
        while(c>=b)
        {
            int d=c/b;
            a=a+d;
            c=c%b+d;
        }
        return a;
    }
}