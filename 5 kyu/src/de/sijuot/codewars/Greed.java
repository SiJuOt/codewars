package de.sijuot.codewars;

import java.util.Arrays;

public class Greed {

    public static int greedy(int[] dice) {
        int[] counts = new int[7];
        for (int die : dice) {
            counts[die]++;
        }
        int score = 0;

        if (counts[1] >= 3) {
            score += 1000;
            counts[1] -= 3;
        }
        if (counts[6] >= 3) {
            score += 600;
            counts[6] -= 3;
        }
        if (counts[5] >= 3) {
            score += 500;
            counts[5] -= 3;
        }
        if (counts[4] >= 3) {
            score += 400;
            counts[4] -= 3;
        }
        if (counts[3] >= 3) {
            score += 300;
            counts[3] -= 3;
        }
        if (counts[2] >= 3) {
            score += 200;
            counts[2] -= 3;
        }

        score += counts[1] * 100;
        score += counts[5] * 50;
        return score;
    }

}
