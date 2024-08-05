class Solution {
   public int minMovesToSeat(int[] seats, int[] students) {
        // Sort the seats and students arrays
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int totalMoves = 0;
        
        // Iterate over both sorted arrays to calculate the total moves
        for (int i = 0; i < seats.length; i++) {
            int move = Math.abs(students[i] - seats[i]);
            totalMoves += move;
        }
        
        return totalMoves;
    }
}