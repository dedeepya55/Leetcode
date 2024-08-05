class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l=new ArrayList<>();
        int o=0;int h=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>h){
                h=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            o=candies[i]+extraCandies;
            if(o>=h)
            {
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}