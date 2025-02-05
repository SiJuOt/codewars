package de.sijuot.codewars;

public class Vaporcode {

    /**
     * Funktion, welche einen Text in einen Vaporwave Text umschreibt.
     *
     * @param input Text, welcher in Vaporwave geschrieben werden soll.
     * @return V  A  P  O  R  W  A  V  E  T  E  X  T  .
     */
    public static String vaporcode(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            // überspringt alle Leerzeichen.
            if (input.charAt(i) == ' ')
                continue;
            result.append(input.toUpperCase().charAt(i)).append("  ");
        }
        return result.toString().trim();
    }

}
