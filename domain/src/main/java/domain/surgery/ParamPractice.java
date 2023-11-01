package domain.surgery;

import domain.surgery.fees.RoleBasedFee;
import domain.people.HealthInsurance;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ParamPractice {
    private Centre centre;
    private Specialty especialidad;
    private HealthInsurance healthInsurance;
    private Float precio;
    private List<RoleBasedFee> honorariosPorRol;

    public ParamPractice(){

    }
}
