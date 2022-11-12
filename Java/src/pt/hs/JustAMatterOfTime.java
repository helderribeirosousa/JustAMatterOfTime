package pt.hs;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JustAMatterOfTime {

    public static void main(String[] args) {

        // Capturing current time
        Instant now = Instant.now();

        // Converting current time to an ISO-8601 UTC timestamp
        String iso8601UtcTimestamp = now.toString();

        System.out.println("-----------------------------------------------------------------------------------------------");
        // Printing timestamp
        System.out.print("ISO-8601 UTC Timestamp: ");
        System.out.println(iso8601UtcTimestamp);
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Converting current time to some locations' local time

        // Honolulu
        ZonedDateTime localTimeInHonolulu = ZonedDateTime.ofInstant(now, ZoneId.of("Pacific/Honolulu"));
        System.out.print("Local time in Honolulu: ");
        System.out.println(localTimeInHonolulu.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

        // New York City
        ZonedDateTime localTimeInNewYorkCity = ZonedDateTime.ofInstant(now, ZoneId.of("America/New_York"));
        System.out.print("Local time in New York City: ");
        System.out.println(localTimeInNewYorkCity.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Azores
        ZonedDateTime localTimeInAzores = ZonedDateTime.ofInstant(now, ZoneId.of("Atlantic/Azores"));
        System.out.print("Local time in Azores: ");
        System.out.println(localTimeInAzores.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Lisbon
        ZonedDateTime localTimeInLisbon = ZonedDateTime.ofInstant(now, ZoneId.of("Europe/Lisbon"));
        System.out.print("Local time in Lisbon: ");
        System.out.println(localTimeInLisbon.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Kolkata
        ZonedDateTime localTimeInKolkata = ZonedDateTime.ofInstant(now, ZoneId.of("Asia/Kolkata"));
        System.out.print("Local time in Kolkata: ");
        System.out.println(localTimeInKolkata.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Tokyo
        ZonedDateTime localTimeInTokyo = ZonedDateTime.ofInstant(now, ZoneId.of("Asia/Tokyo"));
        System.out.print("Local time in Tokyo: ");
        System.out.println(localTimeInTokyo.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Kiritimati
        ZonedDateTime localTimeInKiritimati = ZonedDateTime.ofInstant(now, ZoneId.of("Pacific/Kiritimati"));
        System.out.print("Local time in Kiritimati: ");
        System.out.println(localTimeInKiritimati.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");

    }
}
