package de.sijuot.codewars;

public class CaesarCrypto {

    /**
     * 'Cryptography #1 - Viva Cesare'
     * Verschlüsselt einen Text mit der CAESAR Verschlüsselung.
     * Hierzu benötigt wird der zu verschlüsselnde Text, und die Verschiebung.
     *
     * @param text Der Text, welcher verschlüsselt werden soll.
     * @param shift Die Verschiebung.
     * @return Der verschlüsselte Text.
     */
    public static String encode(String text, int shift) {
        // Prüft, ob der Text verschlüsselt werden kann.
        if (text == null || text.isEmpty() || text.isBlank())
            return "";
        StringBuilder result = new StringBuilder();

        shift = shift % 52;

        // Schleife, in der jeder Buchstabe vom Text durchgegangen wird.
        for (char x : text.toCharArray()) {
            // Überprüft, ob der Buchstabe zum Alphabet gehört, tut er das nicht, bleibt er unverschlüsselt.
            if (!Character.isAlphabetic(x)) {
                result.append(x);
                continue;
            }
            boolean uppercase = Character.isUpperCase(x);
            char base = uppercase ? 'A' : 'a';
            // Länge des Alphabets
            int alphabetSize = 26;
            // Kombinierte Länge des Alphabets (1x Groß + 1x Klein)
            int totalSize = 52;
            // Neue Position im kombinierten Alphabet
            int position = (x - base + shift + totalSize) % totalSize;
            // Falls die Position unter 0 ist, wird sie um 52 erhöht.
            if(position < 0)
                position += totalSize;
            // Prüft, ob die neue Position innerhalb des Bereiches der ursprünglichen Groß- und Kleinbuchstaben liegt, oder ob sie getauscht werden muss.
            if(position < alphabetSize) {
                x = (char) (base + position);
            } else {
                x = (char) (base + position - alphabetSize);
                if(Character.isUpperCase(base))
                    x += 'a' - 'A';
                else
                    x -= 'a' - 'A';
            }
            result.append(x);
        }
        return result.toString();
    }

}
