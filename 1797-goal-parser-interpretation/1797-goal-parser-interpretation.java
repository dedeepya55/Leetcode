class Solution {
    public String interpret(String command) {
        char[] n=new char[command.length()];
        int j=0;
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G')
            {
                n[j]='G';
                j++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                n[j]='o';
                j++;
                i++;
            }
            else{
                n[j]='a';
                n[j+1]='l';
                j=j+2;
                i+=3;
            }
        }
        String s=new String(n,0,j);
        return s;
    }
}