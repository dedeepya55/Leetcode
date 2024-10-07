class Solution {
    public int minLength(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(!s1.isEmpty() && ((s1.peek()=='A' && c=='B')||(s1.peek()=='C' && c=='D'))){
                s1.pop();
            }
            else{
                s1.push(c);
            }
        }
        return s1.size();
    }
}