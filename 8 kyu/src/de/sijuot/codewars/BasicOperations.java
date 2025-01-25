package de.sijuot.codewars;

public class BasicOperations {

    /**
     * Berechnet, mit dem gegebenem Operator und den gegebenen Zahlen v1 und v2 ein Ergebnis.
     *
     * @param op Die mathematische Operation, welche angewendet werden soll (+, -, *, /)
     * @param v1 Zahl 1
     * @param v2 Zahl 2
     * @return Das Ergebnis der mathematischen Operation.
     */
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        // Führt die mathematischen Operationen aus.
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
                break;
            default:
                break;
        }
        return result;
    }

}
