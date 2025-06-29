class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int j = i;
            while (j < n) {
                sb.append(s.charAt(j));
                String candidate = sb.toString();
                if (!seen.contains(candidate)) {
                    result.add(candidate);
                    seen.add(candidate);
                    break; 
                }
                j++;
            }
            i = j + 1;
        }
        return result;
    }
}
