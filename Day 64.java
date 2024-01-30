class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int a = text1.length();
        int b = text2.length();
        int[][] x = new int[a + 1][b + 1];
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= b; j++)
            {       
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                {
                    x[i][j] = x[i - 1][j - 1] + 1;
                }
                else
                {
                    x[i][j] = Math.max(x[i - 1][j], x[i][j - 1]);
                }
            }
        }
        return x[a][b];
    }
}
