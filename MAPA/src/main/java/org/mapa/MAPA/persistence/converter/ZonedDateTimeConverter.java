package org.mapa.MAPA.persistence.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.hibernate.grammars.hql.HqlParser;
import org.mapa.MAPA.web.formatter.DateFormatter;

import java.time.ZonedDateTime;

@Converter(autoApply = true)
public class ZonedDateTimeConverter implements AttributeConverter<ZonedDateTime, String> {
    public String convertToDatabaseColumn(ZonedDateTime dateTime) {
        return DateFormatter.formatFullDateTime(dateTime);
    }

    public ZonedDateTime convertToEntityAttribute(String s) {
        ZonedDateTime zonedDateTime;
        if(s == null)
            zonedDateTime = null;
        else
            zonedDateTime = ZonedDateTime.parse(s);

        return zonedDateTime;
    }
}
