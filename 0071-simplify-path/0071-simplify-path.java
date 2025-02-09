class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] dir=path.split("/");
        for(String i:dir){
            if(i.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else if(!i.isEmpty() && !i.equals(".")){
                s.push(i);
            }
        }
        if(s.isEmpty()){
            return "/";
        }
        Stack<String> s1=new Stack<>();
        StringBuilder k=new StringBuilder();
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        while(!s1.isEmpty()){
            k.append('/');
            k.append(s1.pop());
        }
        return k.toString();
    }
}