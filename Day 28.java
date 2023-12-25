class Solution {
    public String predictPartyVictory(String senate) {
        int a = senate.length();
        Deque<Integer> x = new ArrayDeque<>();
        Deque<Integer> y = new ArrayDeque<>();
        for (int i = 0; i < a; ++i) {
            if (senate.charAt(i) == 'R') {
                x.offer(i);
            } else {
                y.offer(i);
            }
        }
        while (!x.isEmpty() && !y.isEmpty()) {
            int m = x.peek();
            int n = y.peek();
            if (m < n) {
                x.offer(m + a);
            } else {
                y.offer(n + a);
            }
            x.poll();
            y.poll();
        }
        return x.isEmpty() ? "Dire" : "Radiant";
    }
}
