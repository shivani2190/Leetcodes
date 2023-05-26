class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> temp = new HashMap<>();
        char[] alphabet = new char[26];
        int itr = 0;
        for (char c = 'a'; c <= 'z'; ++c) {
            alphabet[c - 'a'] = c;
        }
        for (int i = 0; i < key.length(); i++) {
            if (!temp.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                temp.put(key.charAt(i), alphabet[itr++]);
            }
        }
        for (int j = 0; j < message.length(); j++) {
            if (message.charAt(j) == ' ') {
                sb.append(' ');
            } else {
                char result = temp.get(message.charAt(j));
                sb.append(result);
            }
        }
        return sb.toString();
    }
}