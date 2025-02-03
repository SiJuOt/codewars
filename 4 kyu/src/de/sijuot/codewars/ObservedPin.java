package de.sijuot.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservedPin {

    // Map, welche jeder Ziffer ihre benachbarten Ziffern zuordnet.
    private static final Map<Character, List<Character>> ADJACENT_DIGITS = Map.of(
            '0', List.of('0', '8'),
            '1', List.of('1', '2', '4'),
            '2', List.of('1', '2', '3', '5'),
            '3', List.of('2', '3', '6'),
            '4', List.of('1', '4', '5', '7'),
            '5', List.of('2', '4', '5', '6', '8'),
            '6', List.of('3', '5', '6', '9'),
            '7', List.of('4', '7', '8'),
            '8', List.of('5', '7', '8', '9', '0'),
            '9', List.of('6', '8', '9')
    );

    /**
     * Methode zur generierung aller möglichen PIN-Kombinationen.
     * @param observed Der beobachtete PIN.
     * @return Liste mit Strings aller PIN-Kombinationen.
     */
    public static List<String> getPINs(String observed) {
        List<List<Character>> possibleVariations = new ArrayList<>();

        // Für jede eingegebene Ziffer, die möglichen Variationen hinzufügen.
        for(char digit : observed.toCharArray()) {
            possibleVariations.add(ADJACENT_DIGITS.get(digit));
        }

        List<String> pins = new ArrayList<>();
        generateCombinations(possibleVariations, 0, new StringBuilder(), pins);
        return pins;
    }

    private static void generateCombinations(List<List<Character>> lists, int index, StringBuilder current, List<String> results) {
        if(index == lists.size()) {
            results.add(current.toString());
            return;
        }
        // Iteration durch jede mögliche Variation für die aktuelle Ziffer.
        for(char c : lists.get(index)) {
            current.append(c);
            generateCombinations(lists, index + 1, current, results);
            current.deleteCharAt(current.length() - 1);
        }
    }

}
