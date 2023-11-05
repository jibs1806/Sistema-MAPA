package domain.surgery.fees;

import domain.people.SurgeryRole;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RoleBasedFee {
    private SurgeryRole surgeryRole;
    private Double percentage;

    public RoleBasedFee(SurgeryRole surgeryRole, Double percentage) {
        this.surgeryRole = surgeryRole;
        this.percentage = percentage;
    }
}
