class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        int oddMax=0;
        int cc=0;
        int cnt=0;
        for(Map.Entry<Character,Integer> ele:m.entrySet()){
            if(ele.getValue()%2==0){
                cnt+=ele.getValue();
            }
            else{
                if(ele.getValue()-1!=0){
                    cnt+=ele.getValue()-1;
                    cc=1;
                }
                else{
                    oddMax=Math.max(oddMax,ele.getValue());
                }
            }
        }
        if(oddMax==0 && cc==1) oddMax=1;
        return cnt+oddMax;
    }
}