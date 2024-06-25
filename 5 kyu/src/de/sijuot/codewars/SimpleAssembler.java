package de.sijuot.codewars;

import java.util.HashMap;
import java.util.Map;

public class SimpleAssembler {

    public static Map<String, Integer> interpret(String[] program) {
        Map<String, Integer> result = new HashMap<>();
        // Schleife, in dem jede Zeile vom Code ausgeführt wird.
        for (int i = 0; i < program.length; i++) {
            String line = program[i];
            String[] arguments = line.split(" ");
            switch (arguments[0]) {
                case "mov":
                    result.put(arguments[1], Integer.parseInt(arguments[2]));
                    break;
                case "inc":
                    result.put(arguments[1], result.get(arguments[1]) + 1);
                    break;
                case "dec":
                    result.put(arguments[1], result.get(arguments[1]) - 1);
                    break;
                case "jnz":

                    break;
            }
        }
        return result;
    }

}
