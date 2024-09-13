class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] r=new StringBuilder[numRows];
        for(int i=0;i<r.length;i++){
            r[i]=new StringBuilder();
        }
        int c=0;
        boolean yes=false;
        for(int i=0;i<s.length();i++){
            r[c].append(s.charAt(i));
            if(c==0 || c==numRows-1){
                yes=!yes;
            }
            c=c+ (yes? 1 : -1);
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder row:r){
            res.append(row);
        }
        return res.toString();
    }
}