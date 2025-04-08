package de.sijuot.codewars;

public class ROT135 {

    public static String ROT135(String input) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                output.append((char) ((c - 'a' + 13) % 26 + 'a')); // Rotate Lowercase letters
            } else if (c >= 'A' && c <= 'Z') {
                output.append((char) ((c - 'A' + 13) % 26 + 'A')); // Rotate Uppercase letters.
            } else if (c >= '0' && c <= '9') {
                output.append((char) ((c - '0' + 5) % 10 + '0')); // Rotate Digits
            } else {
                output.append(c); // keep special characters unchanged
            }
        }
        return output.toString();
    }

}
