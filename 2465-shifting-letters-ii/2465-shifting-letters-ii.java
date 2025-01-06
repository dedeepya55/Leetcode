class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int[] arr=new int[s.length()];
        // Arrays.fill(arr,0);
        for(int i=0;i<shifts.length;i++){
            int k=shifts[i][2];
            int l=shifts[i][0];int h=shifts[i][1];
            int d=(k==0 ? -1: 1);
            arr[l]=arr[l]+d;
            if(h+1<n){
                arr[h+1]=arr[h+1]-d;
            }
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            arr[i]=c;
        }
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<n;i++){
           int a = ((s.charAt(i) - 'a') + arr[i]) % 26;
            if (a < 0) a += 26;
            a += 'a';
            System.out.println(a);
            s1.append((char)a);
        }
        return s1.toString();
    }
}