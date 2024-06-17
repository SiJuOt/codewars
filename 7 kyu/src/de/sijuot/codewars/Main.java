package de.sijuot.codewars;

public class Main {

    public static void main(String[] args) {
        int[] scout = DigitalCypher.encode("scout", 1939);
        for(int letter : scout) {
            System.out.println(letter);
        }
        System.out.println(DigitalCypher.decode(scout, 1939));
    }
}