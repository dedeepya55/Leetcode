class Solution {
    public String decodeMessage(String key, String message) {
        Set<Character> s = new LinkedHashSet<>();
        Character[] arr = new Character[message.length()];
        List<Character> l1 = new ArrayList<>();
        
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ') {
                s.add(key.charAt(i));
            }
        }
        
        for (char ch = 'a';ch <= 'z'; ch++) {
            l1.add(ch);
        }
        
        int index;
        List<Character> list = new ArrayList<>(s);
        
        for (int i = 0; i < message.length(); i++) {
            index = list.indexOf(message.charAt(i));
            if (index != -1) {
                arr[i] = l1.get(index);
            } else{
                arr[i] = message.charAt(i);
            }
        }
        
        char[] charArray = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {  
            charArray[i] = arr[i];
        }
        
        String joinedString = new String(charArray);
        return joinedString;
    }
}
