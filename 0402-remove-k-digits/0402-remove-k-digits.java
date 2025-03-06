class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s=new Stack<>();
        // if(k==1){
        //     StringBuilder p=new StringBuilder();
        //     int max=0;
        //     for(int i=0;i<num.length();i++){
        //         if((num.charAt(i)-'0')>max){
        //             max=num.charAt(i)-'0';
        //         }
        //     }
        //     for(int i=0;i<num.length();i++){
        //         if(max==(num.charAt(i)-'0') && k>0){
        //             k--;
        //         }
        //         else{
        //              p.append(num.charAt(i));
        //         }
        //     }
        //     return p.toString();
        // }
        for(int i=0;i<num.length();i++){
            while(k>0  && !s.isEmpty() && s.peek()>(num.charAt(i)-'0')){
                // System.out.println(s.pop());
                s.pop();
                k--;
            }
            s.push(num.charAt(i)-'0');
        }
        while(!s.isEmpty() && k>0){
            s.pop();
            k--;
        }
        StringBuilder s1=new StringBuilder();
        int base=16;
        while(!s.isEmpty()){
            char a=Character.forDigit(s.pop(), base);
            s1.append(a);
        }
        s1=s1.reverse();
        int top=0;
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='0' && top==0){
                continue;
            }
            else if(top==0){
                top=1;
                s2.append(s1.charAt(i));
            }
            else {
                s2.append(s1.charAt(i));
            }
        }
        if(s2.length()==0) return "0";
        return s2.toString();
    }
}