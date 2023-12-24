package org.mapa.MAPA.domain.surgery.practice;

import org.mapa.MAPA.domain.people.HealthInsurance;
import org.mapa.MAPA.domain.surgery.Centre;
import org.mapa.MAPA.domain.surgery.Specialty;
import org.mapa.MAPA.domain.surgery.fees.RoleBasedFee;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ParamPractice {
    private String detail;
    private Centre centre;
    private Specialty specialty;
    private HealthInsurance healthInsurance;
    private Double price;
    private List<RoleBasedFee> roleBasedFees;

    public ParamPractice(){

    }
}
