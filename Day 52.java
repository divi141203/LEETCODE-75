class Solution {
  public long totalCost(int[] costs, int k, int candidates) {
    long a = 0;
    int i = 0;
    int j = costs.length - 1;
    Queue<Integer> L = new PriorityQueue<>();
    Queue<Integer> R = new PriorityQueue<>();
    for (int x = 0; x < k; x++) {
      while (L.size() < candidates && i <= j)
        L.offer(costs[i++]);
      while (R.size() < candidates && i <= j)
        R.offer(costs[j--]);
      if (L.isEmpty())
        a += R.poll();
      else if (R.isEmpty())
        a += L.poll();
      else if (L.peek() <= R.peek())
        a += L.poll();
      else
        a += R.poll();
    }
    return a;
  }
}
