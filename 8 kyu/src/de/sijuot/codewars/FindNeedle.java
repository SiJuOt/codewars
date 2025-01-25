package de.sijuot.codewars;

public class FindNeedle {

    /**
     * Findet den Text "needle" in einem Array voller Objekte.
     * @param haystack Die Objekte ("Heuballe"), in denen "needle" gesucht wird.
     * @return Ein String, in dem der Index ausgegeben wird.
     */
    public static String findNeedle(Object[] haystack) {
        int index = -1;
        // Geht alle Objekte im Array durch.
        for (int i = 0; i < haystack.length; i++) {
            Object obj = haystack[i];
            // Überprüft, ob das aktuelle Objekt ein String ist.
            if (obj instanceof String text) {
                // Überprüft ob der String "needle" ist.
                // Falls ja, wird der Loop beendet.
                if (text.equals("needle")) {
                    index = i;
                    break;
                }
            }
        }
        return "found the needle at position " + index;
    }

}
