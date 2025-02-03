package de.sijuot.codewars;

import java.util.ArrayList;

public class Metro {

    /**
     * Zählt die Anzahl der passagiere im Bus.
     * @param stops Stops {eingestiegen, ausgestiegen}
     * @return Anzahl der passgiere, welche gerade im Bus sind.
     */
    public static int countPassengers(ArrayList<int[]> stops) {
        int passengers = 0;
        int leave = 0;
        // Geht alle Stops durch.
        for (int[] stop : stops) {
            passengers += stop[0];
            leave += stop[1];
        }
        return passengers-leave;
    }

}
