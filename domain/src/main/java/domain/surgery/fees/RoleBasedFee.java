package domain.surgery.fees;

import domain.people.SurgeryRole;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RoleBasedFee {
    private SurgeryRole surgeryRole;
    private Float valor;

    public RoleBasedFee(SurgeryRole surgeryRole, Float valor) {
        this.surgeryRole = surgeryRole;
        this.valor = valor;
    }
}
