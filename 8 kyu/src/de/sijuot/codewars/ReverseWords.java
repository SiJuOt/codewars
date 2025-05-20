package de.sijuot.codewars;

public class ReverseWords {

    /**
     * Reversing the word order of a String
     * @param str String to reverse the words
     * @return The Sentence but the order of Words reversed
     */
    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for(int i = words.length-1; i >= 0; i--) {
            result.append(words[i]);
            if(i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

}
