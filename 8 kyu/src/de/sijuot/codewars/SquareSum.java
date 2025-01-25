package de.sijuot.codewars;

public class SquareSum {

    /**
     * Gibt die Summe der Quadratzahlen der gegebenen Zahlen aus.
     * @param n Zahlen welche quadriert werden sollen.
     * @return Summe der quadrierten Zahlen.
     */
    public static int squareSum(int[] n ) {
        int result = 0;
        // Addiert alle Quadratzahlen.
        for(int num : n) {
            result += (num * num);
        }
        return result;
    }

}
