package de.sijuot.codewars;

public class Kata {

    /**
     * 'Highest Scoring Word'
     * Gibt das Wort zurück, welches die meisten Punkte hat.
     * Die Punkte von dem Wort hängen von den Buchstaben des Wortes ab.
     * Der Wert von jedem Buchstaben ist seine Position im Alphabet (a = 1, b = 2, c = 3, usw.)
     * @param s Der String bei dem das Wort gesucht werden soll.
     * @return Das Wort mit den meisten Punkten
     */
    public static String high(String s) {
        String highestWord = "";
        int highscore = 0;
        // Teilt den String in alle seine Wörter
        String[] words = s.split(" ");

        // Schleife, welche durch jedes Wort geht.
        for (String word : words) {
            int score = 0;
            // Jeder Buchstabe des Wortes wird durchgegangen und seine Summe wird zur Gesamtsumme des Wortes addiert.
            for (char x : word.toCharArray()) {
                score += (x - 'a') + 1;
            }
            // Es wird geprüft, ob die aktuelle Punktzahl höher ist als die aktuell höchste Punktzahl
            if (score > highscore) {
                highscore = score;
                highestWord = word;
            }
        }

        return highestWord;
    }

}
