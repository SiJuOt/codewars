package de.sijuot.codewars;

public class Main {

    public static void main(String[] args) {
        System.out.println(RegexPin.validatePin("1234"));
        System.out.println(RegexPin.validatePin("0000"));
        System.out.println(RegexPin.validatePin("123456"));
        System.out.println(RegexPin.validatePin("098765"));
        System.out.println(RegexPin.validatePin("000000"));
        System.out.println(RegexPin.validatePin("090909"));
    }
}