package org.mapa.MAPA.domain.surgery.fees;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.persistence.PKClasses.MemberBasedFeePK;

import java.io.Serializable;

@Entity
@Table(name = "memberbasedfee")
@Getter @Setter
@IdClass(MemberBasedFeePK.class)
public class MemberBasedFee implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_person_id"))
    private Person person;

    @Id
    @ManyToOne
    @JoinColumn(name = "surgery_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_surgery_id"))
    private Surgery surgery;

    @Column(name = "assignedAmount")
    private Double assignedAmount;



    public MemberBasedFee(Person person) {
        this.person = person;
    }

    public MemberBasedFee() {

    }
}
