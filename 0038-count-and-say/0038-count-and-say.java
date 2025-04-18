class Solution {
    public String countAndSay(int n) {
        StringBuilder s=new StringBuilder();
        s.append("1");
        n=n-1;
        while(n-->0){
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<s.length();i++){
                int cnt=1;
                while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                    cnt++;
                    i++;
                }
                s1.append(cnt);
                s1.append(s.charAt(i));
                // System.out.println(cnt+" "+s.charAt(i));
            }
            s=s1;
            System.out.println(s);
        }
        return s.toString();
    }
}