package domain.surgery.practice;

import domain.surgery.Centre;
import domain.surgery.Specialty;
import domain.surgery.fees.RoleBasedFee;
import domain.people.HealthInsurance;
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
