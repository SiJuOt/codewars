package de.sijuot.codewars;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.HashMap;

public class CrackThePin {

    public static final HashMap<String, String> TABLE = new HashMap<>();

    static {
        // Erstellt eine HashMap mit allen Hashwerten von den Zahlen 0 bis 99999.
        // Da die HashMap hier einmal komplett gefüllt wird, müssen nicht jedes mal neue Berechnungen gemacht werden, sondern es kann direkt auf die Liste zugegriffen werden.
        for(int i = 0; i < 99999; i++) {
            String pin = String.format("%05d", i);
            TABLE.put(md5(pin), pin);
        }
    }

    /**
     * Methode um einen Pin zu cracken.
     *
     * @param hash Der Hash vom Pin
     * @return Gibt den Pin vom Hash zurück.
     */
    public String crack(String hash) {
        return TABLE.getOrDefault(hash, null);
    }

    /**
     * Konvertiert einen String in einen MD5-Hash.
     *
     * @param input Der String, welcher konvertiert werden soll.
     * @return Der MD5-Hash.
     */
    public static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes());
            return bytesToArray(digest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Methode um ein Byte Array als String darzustellen.
     *
     * @param bytes Das zu darstellende Byte Array
     * @return Das dargestellte Byte Array.
     */
    public static String bytesToArray(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

}
