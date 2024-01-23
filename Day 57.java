class Solution {
  public List<String> letterCombinations(String digits) {
    if (digits.isEmpty())
      return new ArrayList<>();
    List<String> ans = new ArrayList<>();
    ans.add("");
    String[] digitToLetters = {"",    "",    "abc",  "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
    for (char d : digits.toCharArray()) {
      List<String> t = new ArrayList<>();
      for (String s : ans)
      {
        for (char c : digitToLetters[d - '0'].toCharArray())
        {
          t.add(s + c);
        }
      }
      ans = t;
    }
    return ans;
  }
}
