class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i]; 
            
            if (!(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))) {
                s.push(Integer.parseInt(token));
            } 
            else {
                int x = s.pop();
                int y = s.pop();
                
                if (token.equals("+")) {
                    s.push(y + x);
                } else if (token.equals("-")) {
                    s.push(y - x);
                } else if (token.equals("*")) {
                    s.push(y * x);
                } else if (token.equals("/")) {
                    s.push(y / x);
                }
            }
        }
        return s.pop(); 
    }
}
