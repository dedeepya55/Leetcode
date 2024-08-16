class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int min=arrays.get(0).get(0);
      int max=arrays.get(0).get(arrays.get(0).size()-1);
      int d=0;
      for(int i=1;i<arrays.size();i++){
        List<Integer> o=arrays.get(i);
        int omin=o.get(0);
        int omax=o.get(o.size()-1);
        d=Math.max(d,Math.abs(omax-min));
        d=Math.max(d,Math.abs(omin-max));
        min=Math.min(min,omin);
        max=Math.max(max,omax);
      }
      return d;
    }
}
