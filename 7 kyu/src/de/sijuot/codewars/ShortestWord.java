package de.sijuot.codewars;

public class ShortestWord {

    /**
     * 'Shortest Word'
     * Sucht das kürzeste Wort aus dem String.
     * @param s Der String aus dem das kürzeste Wort gesucht werden soll.
     * @return Die länge vom kürzesten Wort.
     */
    public static int findShort(String s) {
        // Teilt den String in die einzelnen Wörter um.
        String[] split = s.split(" ");
        // Die Länge vom kürzesten Wort.

        int shortest = split[0].length();

        // Geht in einer Schleife alle Wörter durch.
        for (String string : split) {

            // Prüft, ob das aktuelle Wort weniger Buchstaben hat, als das aktuell kürzeste.
            if (string.length() < shortest)
                shortest = string.length();
        }
        return shortest;
    }

}
