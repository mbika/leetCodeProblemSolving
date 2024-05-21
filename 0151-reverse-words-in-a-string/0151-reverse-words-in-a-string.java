class Solution {
    public String reverseWords(String s) {
        String[] arString = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = arString.length -1;i>=0;i--){
            sb.append(arString[i]);
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}