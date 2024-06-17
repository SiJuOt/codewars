package de.sijuot.codewars;

public class Prime {

    /**
     * 'Is a number prime?'
     * Prüft, ob die eingegebene Zahl eine Primzahl ist.
     * @param num Die zu prüfende Zahl.
     * @return True, falls es eine Primzahl. False, falls es keine Primzahl ist.
     */
    public static boolean isPrime(int num) {
        // Alle Zahlen, die unter oder gleich 1 sind, sind keine Primzahl.
        if(num <= 1)
            return false;

        // Schleife von 2 bis zur aufgerundeten Quadratwurzel der Zahl.
        for(int i = 2; i < (int)Math.sqrt(num)+1; i++) {
            // Wenn die Zahl ohne Rest durch i teilbar ist, ist sie keine Primzahl.
            if(num % i == 0) return false;
        }
        return true;
    }

}
