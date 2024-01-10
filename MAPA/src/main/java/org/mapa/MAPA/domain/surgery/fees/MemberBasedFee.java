package org.mapa.MAPA.domain.surgery.fees;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.persistence.Persistent;
import org.mapa.MAPA.persistence.converter.ZonedDateTimeConverter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "memberbasedfee")
@Getter @Setter
public class MemberBasedFee extends Persistent {

    @ManyToOne
    @JoinColumn(name = "specialist_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_specialist_id"))
    private Specialist specialist;

    @Column(name = "assignedAmount")
    private Double assignedAmount;

    @Convert(converter = ZonedDateTimeConverter.class)
    @Column(name = "completionDate")
    private ZonedDateTime completionDate;

    public MemberBasedFee(Specialist specialist) {
        this.specialist = specialist;
    }

    public MemberBasedFee() {

    }
}
