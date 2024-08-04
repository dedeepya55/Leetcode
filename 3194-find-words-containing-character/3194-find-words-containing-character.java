class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        int j=0;
        List<Integer> arr=new ArrayList<>();
        String x1=String.valueOf(x);
        for(int i=0;i<n;i++){
            if(words[i].contains(x1))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}