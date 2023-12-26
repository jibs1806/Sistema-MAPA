package org.mapa.MAPA.domain.surgery.fees;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "MemberBasedFee")
@Getter @Setter
public class MemberBasedFee extends Persistent {
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "surgery_id", referencedColumnName = "id")
    private Surgery surgery;

    @Column(name = "assignedAmount")
    private Double assignedAmount;



    public MemberBasedFee(Person person) {
        this.person = person;
    }

    public MemberBasedFee() {

    }
}
