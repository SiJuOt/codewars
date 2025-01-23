package de.sijuot.codewars;

import java.util.Arrays;

public class Counter {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            // Checks if the Boolean is not null and if the Boolean is true
            if (sheep != null && sheep) count++;
        }
        return count;
    }

}
