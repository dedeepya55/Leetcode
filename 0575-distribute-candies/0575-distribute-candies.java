class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandyTypes = new HashSet<>();
      
        for (int c : candyType) {
            uniqueCandyTypes.add(c);
        }
      
        int halfCandies = candyType.length / 2;
      
        return Math.min(halfCandies, uniqueCandyTypes.size());
    }
}