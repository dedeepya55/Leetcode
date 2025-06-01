class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int w=0;
        List<Integer> l=new ArrayList<>();
        for(int j=0;j<s.length();j++){
                int k=s.charAt(j)-97;
                if(w+widths[k]>100){
                    l.add(w);
                    w=0;
                }
                w+=widths[k];
            }
        int[] arr=new int[2];
        arr[0]=l.size()+1;
        arr[1]=w;
        return arr;
    }
}