class Solution {
    public int scoreOfString(String s) {
        
        int total = 0;
        int length = s.length();
        for(int i = 0;i<length -1;i++){
            total+=Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return total;
    }
}