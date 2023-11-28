class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int a = word1.length();
        int b = word2.length();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a || i < b; i++)
         {
            if (i < a) 
            {
                s.append(word1.charAt(i));
            }
            if (i < b) 
            {
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}
