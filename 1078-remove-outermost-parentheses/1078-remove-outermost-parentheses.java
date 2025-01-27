class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int st=0;
        for(int i=0;i<s.length();i++){
            if(st>=1 && s.charAt(i)=='('){
                ans.append('(');
                st+=1;
                 System.out.println(s.charAt(i)+" "+i);
            }
            else if(st>=2 && s.charAt(i)==')'){
                ans.append(')');
                st-=1;
                //  System.out.println(s.charAt(i)+" "+i);
            }
            else if(st==0 && s.charAt(i)=='('){
                st+=1;
                //  System.out.println(s.charAt(i)+" "+i);/
            }
            else if(st==1 && s.charAt(i)==')'){
                st-=1;
                //  System.out.println(s.charAt(i)+" "+i);
            }
        }
        return ans.toString();
    }
}