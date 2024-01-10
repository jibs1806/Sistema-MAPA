package org.mapa.MAPA.domain.surgery.fees;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.roles.SurgeryRole;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.mapa.MAPA.persistence.PKClasses.RoleBasedFeePK;

import java.io.Serializable;

@Entity
@Table(name = "RoleBasedFee")
@Getter @Setter
@IdClass(RoleBasedFeePK.class)
public class RoleBasedFee implements Serializable {
    @Id
    @ManyToOne
    @MapsId
    @JoinColumn(name = "practice_id", referencedColumnName = "id")
    private Practice practice;

    @Id
    @MapsId
    @Column(name = "surgeryRole")
    @Enumerated(EnumType.STRING)
    private SurgeryRole surgeryRole;

    @Column(name = "percentage")
    private Double percentage;


    public RoleBasedFee(SurgeryRole surgeryRole, Double percentage) {
        this.surgeryRole = surgeryRole;
        this.percentage = percentage;
    }

    public RoleBasedFee() {

    }
}
