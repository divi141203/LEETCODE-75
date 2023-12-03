class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");
        StringBuffer rev=new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
            if(str[i]!=" ")
            {
                rev.append(str[i]);
            }
            if(i!=0)
            {
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}
