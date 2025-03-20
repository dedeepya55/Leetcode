class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int d=Math.abs(target[0])+Math.abs(target[1]);
        for(int[] ghost:ghosts){
            if(d>=Math.abs(target[0]-ghost[0])+Math.abs(target[1]-ghost[1])){
                return false;
            }
        }
        return true;
    }
}