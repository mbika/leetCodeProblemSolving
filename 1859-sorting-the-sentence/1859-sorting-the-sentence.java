class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '0' - 1;
            sortedWords[position] = word.substring(0, word.length() - 1);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sortedWords.length; i++) {
            result.append(sortedWords[i]);
            if (i < sortedWords.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString(); 
    }
}