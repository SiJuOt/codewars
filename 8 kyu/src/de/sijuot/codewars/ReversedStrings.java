package de.sijuot.codewars;

public class ReversedStrings {

    /**
     * Schreibt einen String rückwärts.
     * @param str Der String welcher Rückwärts geschrieben werden soll.
     * @return Der Rückwärts geschriebene Text.
     */
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
