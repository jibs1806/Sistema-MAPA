package domain.surgery;

import domain.surgery.fees.RoleBasedFee;
import domain.people.HealthInsurance;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Practice {
    private Centre centre;
    private Specialty especialidad;
    private HealthInsurance healthInsurance;
    private Float precio;
    private List<RoleBasedFee> honorariosPorRol;

    public Practice(ParamPractice paramPractice) {
        this.centre = paramPractice.getCentre();
        this.especialidad = paramPractice.getEspecialidad();
        this.healthInsurance = paramPractice.getHealthInsurance();
        this.precio = paramPractice.getPrecio();
        this.honorariosPorRol = paramPractice.getHonorariosPorRol();
    }
}
