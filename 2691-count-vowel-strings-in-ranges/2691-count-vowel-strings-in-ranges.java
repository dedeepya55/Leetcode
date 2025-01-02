class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
      List<Integer> l=new ArrayList<>();
      String str="aeiou";
      for(int i=0;i<words.length;i++){
        Character a=words[i].charAt(0);
        Character b=words[i].charAt(words[i].length()-1);
        if(str.indexOf(a) != -1 && str.indexOf(b) != -1){
            if(i==0){
                l.add(1);
            }
            else{
                l.add(l.get(i-1)+1);
            }
        } 
        else{
             if(i==0){
                l.add(0);
            }
            else{
                l.add(l.get(i-1));
            }
        }
      }
      int[] af=new int[queries.length];
      for(int i=0;i<queries.length;i++){
         int[] ar=queries[i];
         int k=ar[0];
         int lo=ar[1];
         if(k==0){
            af[i]=l.get(lo);
         }
         else{
            af[i]=l.get(lo)-l.get(k-1);
         }
      }
      return af;
    }
}