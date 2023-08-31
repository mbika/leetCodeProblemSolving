class Solution {
    public void reverseString(char[] s) {
        int start=0;
        for(int i=s.length-1;i>=start;i--)
        {
            char temp=s[start];
            s[start]=s[i];
            s[i]=temp;
            start++;  
        
		}
    }
}