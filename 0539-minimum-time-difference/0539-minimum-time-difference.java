class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<timePoints.size();i++){
            String h=timePoints.get(i);
            int m=(h.charAt(3)-'0')*10+(h.charAt(4)-'0');
             int hours = (h.charAt(0) - '0') * 10 + (h.charAt(1) - '0');
             int t= hours * 60 + m;
            l.add(t);
        }
        Collections.sort(l);
        int k=Integer.MAX_VALUE;
         for (int i = 0; i < l.size() - 1; i++) {
            int diff = l.get(i + 1) - l.get(i);
            k = Math.min(k, diff);
        }
         int con = (1440 - l.get(l.size() - 1)) + l.get(0);
        k = Math.min(k, con);
        return k;
    }
}