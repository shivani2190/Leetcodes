class Solution {
    public int countCharacters(String[] words, String chars) {
        if (chars.equals("") || words == null || words.length ==0){
                return 0;
            }
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < chars.length(); i++) {
                if (map.get(chars.charAt(i)) == null){
                    map.put(chars.charAt(i), 1);
                } else {
                    map.put(chars.charAt(i), map.get(chars.charAt(i))+1);
                }
            }

            int ans = 0;
            HashMap<Character, Integer> temp = new HashMap<>(map);
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if (map.containsKey(word.charAt(i))){
                        map.put(word.charAt(i),map.get(word.charAt(i))-1);
                    }
                    if (map.get(word.charAt(i)) == null || map.get(word.charAt(i)) < 0){
                        break;
                    }
                    if (i == word.length()-1){
                        ans += word.length();
                    }
                }
                map = new HashMap<>(temp);
            }

            return ans;
    }
}