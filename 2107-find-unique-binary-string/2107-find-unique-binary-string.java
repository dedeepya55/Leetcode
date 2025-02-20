class Solution {
    Set<String> s=new HashSet<>();
    String ans="";
    public String findBinary(int n,StringBuilder c){
        if(!ans.equals("")) return ans;
        if(c.length()==n){
            if(!s.contains(c.toString())){
                ans=c.toString();
                return ans;
            }
            return "";
        }
        for(int i=0;i<2;i++){
            c.append((char)('0'+i));
            String res=findBinary(n,c);
            if(!res.equals("")) return res;
            c.deleteCharAt(c.length()-1);
        }
        return ans;
    }
    public String findDifferentBinaryString(String[] nums) {
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        return findBinary(nums[0].length(),new StringBuilder());
    }
}