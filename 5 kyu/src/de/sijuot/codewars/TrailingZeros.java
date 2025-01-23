package de.sijuot.codewars;

public class TrailingZeros {

    public static int zeros(int n) {
        int count = 0;
        // Iterate through the multiples of 5, 25, 125, etc.
        for (int i = 5; n / i >= 1; i *= 5) {
            // Count how many times n can be divided by the current multiple of 5
            count += n / i;
        }
        return count;
    }

}
