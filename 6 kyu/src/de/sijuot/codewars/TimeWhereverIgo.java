package de.sijuot.codewars;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeWhereverIgo {

    /**
     * Konvertiert das Datum von meiner lokalen Zeitzone in die meines Freundes.
     * @param myTime Mein lokales Datum und Uhrzeit.
     * @param myZone Die Zeitzone von mir.
     * @param friendZone Die Zeitzone des Freundes.
     * @return Datum und Uhrzeit des Freundes.
     */
    public static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
        // Formatierung für die Eingabe und Ausgabe definieren.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        // Datum und Uhrzeit aus der String-Darstellung erzeugen
        LocalDateTime localDateTime = LocalDateTime.parse(myTime, formatter);

        // Lokale Zeit mit der angegebenen  Zeitzone kombinieren.
        ZonedDateTime zonedLocalDateTime = localDateTime.atZone(ZoneId.of(myZone));

        // Zeit in die Zeitzone des Freundes umrechnen.
        ZonedDateTime friendZonedDateTime = zonedLocalDateTime.withZoneSameInstant(ZoneId.of(friendZone));

        // Ergebnis im gewünschten Format als String zurückgeben.
        return friendZonedDateTime.format(formatter);
    }

}
