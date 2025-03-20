class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> basket=new ArrayList<>();
        for(int i=0;i<fruits.length;i++){
            basket.add(baskets[i]);
        }
        int cnt=0;
        boolean cant=false;
        int n=basket.size();
        for(int i=0;i<baskets.length;i++){
            cant=false;
            for(int j=0;j<n;j++){
                // System.out.println(fruits[i]+" "+basket.get(j));
                if(basket.get(j)>=fruits[i]){
                    basket.remove(j);
                    cant=true;
                    n=n-1;
                    break;
                }
            }
            if(!cant){
                cnt++;
            }
        }
        return cnt;
        // for(int i=0;i<baskets.length;i++){
        //     int ind=BinarySearch(basket,fruits[i]);
        //     // System.out.println(ind);
        //     if(ind==-1 || ind>=basket.size()){
        //         cnt++;
        //     }
        //     else{
        //         basket.remove(ind);
        //     }
        // }
        // return cnt;
    }
    // public int BinarySearch(List<Integer> basket,int fruit){
    //     int low=0;
    //     int high=basket.size()-1;
    //     // System.out.println(fruit);
    //     if(low==high){
    //         if(basket.get(low)<fruit){
    //             return -1;
    //         }
    //         else{
    //             return low;
    //         }
    //     }
    //     int cnt=0;
    //     int cur=-1;
    //     while(low<high){
    //         int mid=(low+high)/2;
    //         if(basket.get(mid)>=fruit){
    //             // System.out.println(mid);
    //             cnt++;
    //             cur=mid;
    //             high=mid-1;
    //         }
    //         else{
    //             System.out.println(mid);
    //             low=mid+1;
    //         }
    //     }
    //     System.out.println(low+" "+high+" "+cnt);
    //     if((low>=basket.size()|| high<0) && cnt==0){
    //         return -1;
    //     }
    //         return cur;
    // }
}