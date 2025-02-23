class Solution {
    List<String> l=new ArrayList<>();
    public void happy(int n, StringBuilder s) {
        if (s.length() == n) {
            l.add(s.toString()); 
            return;
        }
         for (char c : new char[]{'a', 'b', 'c'}) {
            if (s.length() == 0 || s.charAt(s.length() - 1) != c) {
                s.append(c);      
                happy(n, s);      
                s.deleteCharAt(s.length() - 1);
            }
        }
    }
    public String getHappyString(int n, int k) {
        StringBuilder s=new StringBuilder();
        happy(n,s);
         Collections.sort(l);         

        return k <= l.size() ? l.get(k - 1) : ""; 
    }
}
