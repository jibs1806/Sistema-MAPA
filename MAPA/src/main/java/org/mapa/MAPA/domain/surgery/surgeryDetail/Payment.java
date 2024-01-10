package org.mapa.MAPA.domain.surgery.surgeryDetail;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.surgery.PaymentStatus;
import org.mapa.MAPA.persistence.converter.ZonedDateTimeConverter;

import java.time.ZonedDateTime;
@Embeddable
@Getter @Setter
public class Payment {

    @Column(name = "price")
    private Double price;

    @Convert(converter = ZonedDateTimeConverter.class)
    @Column(name = "paymentDate")
    private ZonedDateTime paymentDate;

    @Column(name = "paymentStatus")
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    public Payment(Double price, ZonedDateTime paymentDate, PaymentStatus paymentStatus) {
        this.price = price;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    public Payment(){

    }
}
