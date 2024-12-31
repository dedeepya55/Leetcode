import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        // int nu=0,no=0;
        // for(int i=0;i<num1.length();i++){
        //     nu=nu*10+(num1.charAt(i)-'0');
        //     // System.out.println(nu);
        // }
        // for(int j=0;j<num2.length();j++){
        //     no=no*10+(num2.charAt(j)-'0');
        //     // System.out.println(no);
        // }
        // long k=(long)nu*(long)no;
        // String str=String.valueOf(k);
        // return str;
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);
        return result.toString();
    }
}