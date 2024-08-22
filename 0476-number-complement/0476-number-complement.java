class Solution {
    public int findComplement(int num) {
        int[] b=new int[32];
        int i=0;int c=0;
        while(num>0){
            b[i]=num%2;
            num=num/2;
            i++;
        }
        for(int j=0;j<i;j++){
            if(b[j]==0){
                b[j]=1;
            }
            else{b[j]=0;}
        }
        for(int j=0;j<i;j++){
            c+=b[j]*Math.pow(2,j);
        }
        return c;
    }
}