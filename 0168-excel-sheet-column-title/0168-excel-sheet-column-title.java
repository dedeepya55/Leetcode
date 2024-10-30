class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder st=new StringBuilder();
        if(columnNumber<27){
            char ch=(char)('A'+columnNumber-1);
            return Character.toString(ch);
        }
        else{
            while(columnNumber>0){
                columnNumber--;
            int h=columnNumber%26;
            st.insert(0,(char)('A'+h));
             columnNumber=columnNumber/26;
            }
            return st.toString();
        }
        // return "Hii";
    }
}