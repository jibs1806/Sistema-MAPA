package org.mapa.MAPA.domain.surgery.fees;

import org.mapa.MAPA.domain.people.Person;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberBasedFee {
    private Person person;
    private Double assignedAmount;

    public MemberBasedFee(Person person) {
        this.person = person;
    }
}
