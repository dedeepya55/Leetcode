class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> m=new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            m.put(heights[i],names[i]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<heights.length;i++)
        {
            l.add(heights[i]);
        } 
        Collections.sort(l,Collections.reverseOrder());
        String[] r=new String[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            r[i]=m.get(l.get(i));
        } 
        return r;
    }
}