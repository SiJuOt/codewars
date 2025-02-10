package de.sijuot.codewars;

public class GrassHopper {

    /**
     * Addiert alle Zahlen bis n miteinander.
     * @param n Zahl.:
     * @return Summe n1+n2+n3+n4+nx.
     */
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
