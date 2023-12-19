class Solution {
  public boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length())
    {
      return false;
    }
    Map<Character, Integer> c1 = new HashMap<>();
    Map<Character, Integer> c2 = new HashMap<>();
    for (char c : word1.toCharArray())
    {
      c1.merge(c, 1, Integer::sum);
    }
    for (char c : word2.toCharArray())
    {
      c2.merge(c, 1, Integer::sum);
    }
    if (!c1.keySet().equals(c2.keySet()))
    {
      return false;
    }
    List<Integer> f1 = new ArrayList<>(c1.values());
    List<Integer> f2 = new ArrayList<>(c2.values());
    Collections.sort(f1);
    Collections.sort(f2);
    return f1.equals(f2);
  }
}
