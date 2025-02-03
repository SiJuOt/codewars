package de.sijuot.codewars;

public class DNAStrand {

    /**
     * Gibt den gegenüberliegenden DNA-Strang von der Eingabe aus.
     * @param dna Der zu invertierende DNA-Strang.
     * @return Der komplementäre DNA Strang.
     */
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        // geht jeden Buchstaben vom DNA-Strang durch.
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.toCharArray()[i];
            // Invertiert den DNA-Strang.
            switch (c) {
                case 'A':
                    sb.append('T');
                    break;
                case 'T':
                    sb.append('A');
                    break;
                case 'C':
                    sb.append('G');
                    break;
                case 'G':
                    sb.append('C');
                    break;
            }
        }
        return sb.toString();
    }

}
