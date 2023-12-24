package org.mapa.MAPA.domain.surgery.practice;

import org.mapa.MAPA.domain.people.HealthInsurance;
import org.mapa.MAPA.domain.surgery.Centre;
import org.mapa.MAPA.domain.surgery.Specialty;
import org.mapa.MAPA.domain.surgery.fees.RoleBasedFee;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Practice {
    private String detail;
    private Centre centre;
    private Specialty specialty;
    private HealthInsurance healthInsurance;
    private Double price;
    private List<RoleBasedFee> roleBasedFees;

    public Practice(ParamPractice paramPractice) {
        this.centre = paramPractice.getCentre();
        this.specialty = paramPractice.getSpecialty();
        this.healthInsurance = paramPractice.getHealthInsurance();
        this.price = paramPractice.getPrice();
        this.roleBasedFees = paramPractice.getRoleBasedFees();
        this.detail = paramPractice.getDetail();
    }
}
