package domain.surgery.practice;

import domain.surgery.Centre;
import domain.surgery.Specialty;
import domain.surgery.fees.RoleBasedFee;
import domain.people.HealthInsurance;
import domain.surgery.practice.ParamPractice;
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
