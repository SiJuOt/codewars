package de.sijuot.codewars;

public class SumArray {

    /**
     * Summe aller Zahlen in einem Array.
     * @param numbers Array mit Zahlen.
     * @return Summe aller Zahlen.
     */
    public static double sum(double[] numbers) {
        double sum = 0;
        for(double number : numbers) {
            sum += number;
        }
        return sum;
    }

}
