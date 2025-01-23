package de.sijuot.codewars;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        // Checks if the Arg is smaller than the smallest, if yes, the smallest will be the arg.
        for(int arg : args) {
            if(arg < smallest) {
                smallest = arg;
            }
        }
        return smallest;
    }

}
