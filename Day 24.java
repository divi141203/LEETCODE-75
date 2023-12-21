class Solution {
  public String removeStars(String s) {
    StringBuilder a = new StringBuilder();
    for (final char b : s.toCharArray())
    {
      if (b == '*')
      {
        a.deleteCharAt(a.length() - 1);
      }
      else
      {
        a.append(b);
      }
    }
    return a.toString();
  }
}
