class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        int operations=0;
        int balls=0;
        for(int i=0;i<boxes.length();i++){
             arr[i]+=operations;
            balls+=boxes.charAt(i)-'0';
            operations+=balls;
        }
         operations=0;
         balls=0;
        for(int i=boxes.length()-1;i>=0;i--){
            arr[i]+=operations;
            balls+=boxes.charAt(i)-'0';
            operations+=balls;
        }
        return arr;
    }
}