class Solution {
    public String reverseWords(String s) {
      String[] str = s.trim().split("\\s+");
        String ans = "";
        for(int i=str.length-1;i>=0;i--){
            ans += str[i]+ " ";
        }
        return ans.trim();//trim is used to remove spaces after the string
    }
}

























































// String[] str = s.trim().split("\\s+");
//         for(int i=0;i<str.length;i++) {
//            System.out.print(str[i]+" "); 
//         }
//         String out = "";
//         for (int i = str.length - 1; i >=0; i--) {
            
//             out += str[i] + " ";
//             System.out.println(out);
//         }
//         return out.trim(); 