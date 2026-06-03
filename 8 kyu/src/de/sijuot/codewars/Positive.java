package de.sijuot.codewars;

public class Positive {

    /**
     * Calculates the sum of all positive integers inside the array.
     * @param array Array of Integer
     * @return Sum of all positive integers inside the Array.
     */
    public static int sum(int[] array) {
        int sum = 0;
        for(int i : array) {
            // checks if the number is positive.
            if(i > 0)
                sum += i;
        }
        return sum;
    }
}
