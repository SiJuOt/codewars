package de.sijuot.codewars;

public class RegexPin {

    /**
     * Prüft ob der eingegebene Pin gültig oder ungültig wäre.
     * @param pin Der Pin, welcher überprüft werden soll.
     * @return True, wenn der Pin gültig ist. False, wenn er ungültig ist.
     */
    public static boolean validatePin(String pin) {
        // Prüft, ob die zu prüfende Pin keine 4 oder 6 Stellen hat.
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        // Prüft, ob die Pin nur aus Zahlen besteht.
        return pin.matches("[0-9]+");
    }

}
