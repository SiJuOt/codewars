package de.sijuot.codewars;

public class RemoveStringSpaces {

    /**
     * Entfernt alle Leerzeichen aus dem String X.
     * @param x Der String, bei dem die Leerzeichen entfernt werden sollen.
     * @return Der String ohne die Leerzeichen
     */
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

}
