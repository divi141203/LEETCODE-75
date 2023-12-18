class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> c = new HashMap<>();
    Set<Integer> x = new HashSet<>();
    for (int a : arr)
    {
      c.merge(a, 1, Integer::sum);
    }
    for (int value : c.values())
    {
      if (!x.add(value))
      {
        return false;
      }
    }
    return true;
  }
}
