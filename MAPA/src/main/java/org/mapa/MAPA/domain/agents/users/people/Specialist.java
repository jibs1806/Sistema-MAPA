package org.mapa.MAPA.domain.agents.users.people;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.roles.SurgeryRole;
import org.mapa.MAPA.persistence.Persistent;


@Entity
@Table(name = "Specialist")
@Getter @Setter
public class Specialist extends Persistent {
    @ManyToOne
    @JoinColumn(name = "boss_id", referencedColumnName = "id")
    private Specialist boss;

    @Column(name = "surgeryRole")
    @Enumerated(EnumType.STRING)
    private SurgeryRole surgeryRole;

    public Specialist(Specialist specialist, SurgeryRole surgeryRole){
        this.surgeryRole = surgeryRole;
        this.boss = specialist;
    }

    public Specialist() {

    }
}
