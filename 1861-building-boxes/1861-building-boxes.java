class Solution {
    public int minimumBoxes(int n) {
        int nBoxes=0;
        int nextBoxes=0;
        int curLevelBoxes=0;
        while(nBoxes<n){
            nextBoxes++;
            curLevelBoxes+=nextBoxes;
            nBoxes+=curLevelBoxes;
        }
         if(nBoxes==n){
        return curLevelBoxes;
    }

    nBoxes-=curLevelBoxes;
    curLevelBoxes-=nextBoxes;
    nextBoxes=0;
    while(nBoxes<n){
        nextBoxes++;
        nBoxes+=nextBoxes;
    }
    return curLevelBoxes+nextBoxes;
    }
}

   