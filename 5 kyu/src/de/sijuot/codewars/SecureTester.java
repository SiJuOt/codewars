package de.sijuot.codewars;

public class SecureTester {

    /**
     * Prüft, ob der eingebene String eine Alphanumerische Zeichenfolge ist.
     * @param s Der String, welcher überprüft werden soll
     * @return True, wenn es ein Alphanumerischer String ist, false wenn nicht.
     */
    public static boolean alphanumeric(String s) {
        return !s.isEmpty() && s.matches("[a-zA-Z0-9]*");
    }

}
