class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length();
        int b = t.length();
        int i = 0, j = 0;
        while (i < a && j < b)
        {
            if (s.charAt(i) == t.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i == a;
    }
}
