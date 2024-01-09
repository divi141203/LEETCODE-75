class Solution {
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int[] x = new int[rooms.size()];
    kr(rooms, 0, x);
    return Arrays.stream(x).allMatch(a -> a == 1);
  }
  private void kr(List<List<Integer>> rooms, int n, int[] x) {
    x[n] = 1;
    for (int y : rooms.get(n))
    {
      if (x[y] == 0)
      {
        kr(rooms, y, x);
      }
    }
  }
}
