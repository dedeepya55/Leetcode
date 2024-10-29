class Solution {
    public int lengthOfLastWord(String s) {
        List<String> l = new ArrayList<>(Arrays.asList(s.split(" ")));
        String st=l.get(l.size()-1);
        return st.length();
    }
}