package de.sijuot.codewars;

public class CharProblem {

    /**
     * 'Parse nice int from char problem'
     * Gibt das Alter des Mädchens als Integer zurück.
     *
     * @param herOld Ein String, der den Namen des Mädchens beinhaltet. (bspw. x years old)
     * @return Das Alter des Mädchens
     */
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.split(" ")[0]);
    }

}
