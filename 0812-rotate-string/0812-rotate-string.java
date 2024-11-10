class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        String s1=s+s;
        return s1.contains(goal);
    }
}