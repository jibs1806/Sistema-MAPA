package org.mapa.MAPA.domain.surgery.practice;

import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.HealthInsurance;
import org.mapa.MAPA.domain.surgery.fees.RoleBasedFee;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Centre;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Specialty;

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
