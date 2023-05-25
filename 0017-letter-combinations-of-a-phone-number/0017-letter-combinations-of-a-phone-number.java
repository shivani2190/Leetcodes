class Solution {
  private List < String > c = new ArrayList < > ();
  private Map < Character, String > letters = Map.of(
    '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
    '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
  private String phoneDigits;
 
  public List < String > letterCombinations(String digits) {
    if (digits.length() == 0) {
      return c;
    }
    phoneDigits = digits;
    backtrack(0, new StringBuilder());
    return c;
  }
 
  private void backtrack(int index, StringBuilder path) {
    if (path.length() == phoneDigits.length()) {
      c.add(path.toString());
      return;
    }
    String p = letters.get(phoneDigits.charAt(index));
    for (char l: p.toCharArray()) {
      path.append(l);
      backtrack(index + 1, path);
      path.deleteCharAt(path.length() - 1);
    }
  }
}