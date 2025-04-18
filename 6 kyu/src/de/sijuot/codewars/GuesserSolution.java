package de.sijuot.codewars;

public class GuesserSolution extends Guesser {

    private int guesses = 0;

    /**
     * Diese Methode versucht, die richtige Zahl durch binäre Suche zu finden.
     * Sie darf maximal 10-mal 'guess()' aufrufen.
     * @return
     */
    public int getNumber() {
        int low = 1;
        int high = 1000;
        while (low <= high && guesses < 10) {
            int mid = (low + high) / 2;
            guesses++;
            String guess = guess(mid); // Ein Aufruf der Methode guess
            if (guess.equals("Correct!")) {
                return mid;
            } else if (guess.equals("Too high!")) {
                high = mid - 1;
            } else if (guess.equals("Too low!")) {
                low = mid + 1;
            }
        }
        throw new RuntimeException("No solution found");
    }

}

class Guesser {
    String guess(int n) {
        return "";
    }
}