class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1=new StringBuilder();
        String o=s.toLowerCase();
        for(int i=0;i<o.length();i++){
            char c=o.charAt(i);
            int a=(int) c;
            if((a>=97 && a<=122) || (a>=47 && a<=57)){
                s1.append(o.charAt(i));
            }
        }
        String k=s1.toString();
        System.out.println(k);
        if(k.equals(s1.reverse().toString())){
            return true;
        }
        return false;

    }
}