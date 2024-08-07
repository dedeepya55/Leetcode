class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> m=new HashMap<>();
       for(String i:strs){
            char j[] = i.toCharArray();
            Arrays.sort(j);
            String a=new String(j);
            if(!m.containsKey(a)){
                m.put(a,new ArrayList<>());
            }
            m.get(a).add(i);
       }
       return new ArrayList<>(m.values());
    }
}