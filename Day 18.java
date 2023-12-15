class Solution {
    public int largestAltitude(int[] gain) {
        int m = 0, s = 0;
        for(int a : gain) 
        {
            s = s + a;
            m = Math.max(s, m);
        }
        return m;
    }
}
