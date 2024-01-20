class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int s = spells[i];
            int a = 0;
            int b = m - 1;
            while (a <= b) {
                int mid = a + (b - a) / 2;
                long product = (long) s * potions[mid];
                if (product >= success) {
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
            pairs[i] = m - a;
        }
        return pairs;
    }
}
