class Solution {
    public String removeDuplicates(String s) {
        LinkedList<Character> list = new LinkedList<>();
    char[] arr = s.toCharArray();
    for (char c : arr) {
        if (!list.isEmpty() && list.getLast() == c) {
            list.removeLast();
        } else {
            list.addLast(c);
        }
    }
    if (list.size() == 0) return "";
    StringBuilder sb = new StringBuilder();
    while (list.size() != 0) sb.append(list.removeFirst());
    return sb.toString();
    }
}