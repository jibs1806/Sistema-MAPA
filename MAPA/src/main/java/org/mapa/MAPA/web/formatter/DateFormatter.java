package org.mapa.MAPA.web.formatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    public static String formatOnlyDate(ZonedDateTime dateTimeWithZone){
        DateTimeFormatter formatterWithZone = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return dateTimeWithZone.format(formatterWithZone);
    }

    public static String formatOnlyTime(ZonedDateTime dateTimeWithZone){
        DateTimeFormatter formatterWithZone = DateTimeFormatter.ofPattern("HH:mm");
        return dateTimeWithZone.format(formatterWithZone);
    }

    public static String formatFullDateTime(ZonedDateTime dateTimeWithZone){
        DateTimeFormatter formatterWithZone = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm - O");
        return dateTimeWithZone.format(formatterWithZone);
    }
}
