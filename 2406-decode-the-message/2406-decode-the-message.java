class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> r=new HashMap<>();
        List<Character> l=new ArrayList<>();
        for(char i='a';i<='z';i++)
        {
            l.add(i);
        }
        int i=0;
        for(char c:key.toCharArray()){
            if(c!=' ' && !r.containsKey(c))
            {
                r.put(c,l.get(i));
                i++;
            }
        }
        int o=0;
        char[] ar=new char[message.length()];
        for(char c:message.toCharArray()){
            if(c==' ')
            {
                ar[o]=' ';
            }
            else{
                ar[o]=r.get(c);
            }
            o++;
        }
        return new String(ar);
    }
}