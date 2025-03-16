class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(i + 1);
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                System.out.println(i+1);
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }
}
