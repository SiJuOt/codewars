package de.sijuot.codewars;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {

    /**
     * 'Find the unique number'
     * Sucht innerhalb eines Arrays eine abweichende Zahl.
     * @param arr Das Array, in dem die abweichende Zahl gefunden werden soll.
     * @return Die abweichende Zahl.
     */
    public static double findUniq(double arr[]) {
        // Map, in der jede Zahl und die ihre Häufigkeit gezählt wird.
        Map<Double, Integer> countMap = new HashMap<>();
        // Zählt wie häufig jede Zahl vorkommt.
        for(double n : arr)
            countMap.put(n, countMap.getOrDefault(n, 0)+1);

        // Sucht den Eintrag in der Map, welcher nur ein einziges Mal vorkommt.
        for(Map.Entry<Double, Integer> entry : countMap.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        throw new IllegalArgumentException("no unique number found");
    }

}
