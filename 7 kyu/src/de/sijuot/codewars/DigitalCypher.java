package de.sijuot.codewars;

public class DigitalCypher {

    /**
     * 'Digital Cypher'
     * Verschlüsselt eine Nachricht.
     * @param message Die Nachricht, welche verschlüsselt werden soll.
     * @param key Die Verschlüsselungszahl
     * @return Das Wort verschlüsselt als Integer Array.
     */
    public static int[] encode(String message, int key) {
        int[] result = new int[message.length()];
        // Konvertiert die Zahl in einen String
        String keyStr = Integer.toString(key);
        int keyLength = keyStr.length();

        // Schleife durch jeden Buchstaben der zu verschlüsselnden Nachricht.
        for(int i = 0; i < message.length(); i++) {
            // Rechnet den Wert vom Buchstaben aus (a = 1, b = 2 usw.)
            int letterValue = message.charAt(i) - 'a' + 1;
            // Rechnet den Wert vom Schlüssel aus
            int keyValue = Character.getNumericValue(keyStr.charAt(i % keyLength));
            result[i] = letterValue + keyValue;
        }

        return result;
    }

    /**
     * 'Digital Cypher vol.2'
     * Entschlüsselt eine Nachricht.
     * @param message Das Array, welche entschlüsselt werden soll.
     * @param key Die Verschlüsselungszahl
     * @return Das Wort, welches entschlüsselt wurde.
     */
    public static String decode(int[] message, int key) {
        StringBuilder result = new StringBuilder();
        // Konvertiert die Zahl in einen String
        String keyStr = Integer.toString(key);
        int keyLength = keyStr.length();

        // Schleife durch jede Zahl, des zu entschlüsselnden Arrays.
        for(int i = 0; i < message.length; i++) {
            // Rechnet den Wert vom Buchstaben aus (a = 1, b = 2 usw.)
            int letterValue = message[i] + 'a' - 1;
            // Rechnet den Wert vom Schlüssel aus
            int keyValue = Character.getNumericValue(keyStr.charAt(i % keyLength));
            result.append(Character.toString(letterValue-keyValue));
        }

        return result.toString();
    }

}
