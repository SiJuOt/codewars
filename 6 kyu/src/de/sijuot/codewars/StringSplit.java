package de.sijuot.codewars;

import java.util.ArrayList;

public class StringSplit {

    /**
     * Teilt einen String alle zwei Zeichen und fügt diese in ein Array hinzu.
     * Sollte der String eine ungerade Anzahl an Zeichen haben, wird ein '_' hinzugefügt.
     * @param s Der String, welcher Geteilt werden soll.
     * @return Der String, welcher alle 2 Zeichen geteilt wurde.
     */
    public static String[] solution(String s) {
        // Fügt bei einer ungeraden Anzahl von Buchstaben ein '_' hinzu, damit der String zu einer geraden Anzahl wird.
        if (s.length() % 2 != 0) {
            s += "_";
        }
        ArrayList<String> list = new ArrayList<>();
        // Teilt den String alle 2 Zeichen und fügt ihn in die Liste hinzu.
        for(int i = 0; i < s.length(); i += 2) {
            list.add(s.substring(i,i+2));
        }
        // Konvertiert die Liste in ein String Array.
        return list.toArray(new String[0]);
    }

}
