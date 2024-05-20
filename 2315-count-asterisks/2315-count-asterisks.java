class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean inBar = false;
        
        int length = s.length();
        for(int i = 0;i<length;i++){
            if(s.charAt(i) == '|'){
                if(inBar){
                    inBar = false;
                }else {
                    inBar = true;
                }
            }else if(s.charAt(i) == '*' && !inBar){
                count++;
            }
        }
        return count;
    }
}