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

}
