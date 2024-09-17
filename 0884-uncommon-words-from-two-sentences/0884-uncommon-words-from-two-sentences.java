class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        StringBuilder s=new StringBuilder();
       List<String> l1=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                l1.add(s.toString());
                s.setLength(0);
            }
            else{
                s.append(s1.charAt(i));
            }
        }
        l1.add(s.toString());
         s.setLength(0);
         for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==' '){
                l1.add(s.toString());
                s.setLength(0);
            }
            else{
                s.append(s2.charAt(i));
            }
        }
          l1.add(s.toString());
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(int i=0;i<l1.size();i++){
            if(a.contains(l1.get(i))){
                a.remove(l1.get(i));
                b.add(l1.get(i));
            }
            else if(!b.contains(l1.get(i))){
                a.add(l1.get(i));
            }
        }
        String[] arr=new String[a.size()];
       return a.toArray(arr);

    }
}