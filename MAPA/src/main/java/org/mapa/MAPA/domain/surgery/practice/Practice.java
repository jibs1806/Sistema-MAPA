package org.mapa.MAPA.domain.surgery.practice;

import jakarta.persistence.*;
import org.mapa.MAPA.domain.people.HealthInsurance;
import org.mapa.MAPA.domain.surgery.Centre;
import org.mapa.MAPA.domain.surgery.Specialty;
import org.mapa.MAPA.domain.surgery.fees.RoleBasedFee;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.persistence.Persistent;

import java.util.List;

@Entity
@Table(name = "Practice")
@Getter @Setter
public class Practice extends Persistent {

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "centre_id", referencedColumnName = "id")
    private Centre centre;

    @ManyToOne
    @JoinColumn(name = "specialty_id", referencedColumnName = "id")
    private Specialty specialty;

    @ManyToOne
    @JoinColumn(name = "healthInsurance_id", referencedColumnName = "id")
    private HealthInsurance healthInsurance;

    @Column(name = "price")
    private Double price;

    @OneToMany(mappedBy = "practice")
    private List<RoleBasedFee> roleBasedFees;

    public Practice(ParamPractice paramPractice) {
        this.centre = paramPractice.getCentre();
        this.specialty = paramPractice.getSpecialty();
        this.healthInsurance = paramPractice.getHealthInsurance();
        this.price = paramPractice.getPrice();
        this.roleBasedFees = paramPractice.getRoleBasedFees();
        this.detail = paramPractice.getDetail();
    }

    public Practice() {

    }
}
