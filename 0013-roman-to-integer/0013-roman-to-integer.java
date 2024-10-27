class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
        char[] arr=new char[]{'I','V','X','L','C','D','M'};
        int[] arr1=new int[]{1,5,10,50,100,500,1000};
        for(int i=0;i<7;i++){
            m.put(arr[i],arr1[i]);
        }
        char c;
        char c1;
        int co=0;
        int i=0;
        while(i!=s.length()){
            c=s.charAt(i);
              if (i < s.length() - 1 && m.get(c) < m.get(s.charAt(i + 1))) {
                    co+=m.get(s.charAt(i+1))-m.get(c);
                    i=i+2;
                }
                else{
                    co+=m.get(c);
                    i+=1;
                }
        }
        return co;
    }
}