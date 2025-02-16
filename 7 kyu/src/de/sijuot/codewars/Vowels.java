package de.sijuot.codewars;

import java.util.Locale;

public class Vowels {

    /**
     * Gibt die Anzahl der gefundenen Vokale (a, e, i, o, u) (nicht y) zurück.
     *
     * @param str Anzahl der Vokale, welche gefunden werden sollten.
     * @return Dei Anzahl der Vokale.
     */
    public static int getCount(String str) {
        int count = 0;
        for (char x : str.toLowerCase().toCharArray()) {
            // Prüft, ob der aktuelle Charakter ein Vokal ist.
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                count++;
            }
        }
        return count;
    }

    /**
     * Gibt den eingegebenen Satz ohne Vokale zurück.
     *
     * @param str String
     * @return String ohne Vokale
     */
    public static String disemvowel(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char x = str.toLowerCase().charAt(i);
            // Prüft, ob der aktuelle Charakter ein Vokal ist.
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                continue;
            result.append(str.charAt(i));
        }

        return result.toString();
    }

}
