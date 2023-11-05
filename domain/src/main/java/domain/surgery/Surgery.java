package domain.surgery;

import domain.surgery.fees.MemberBasedFee;
import domain.people.HealthInsurance;
import domain.people.Person;
import domain.surgery.practice.Practice;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class Surgery {
    private String detail;
    private Practice practice;
    private Centre centre;
    private HealthInsurance healthInsurance;
    private Specialty specialty;
    private Double price;
    private LocalDateTime paymentDate;
    private LocalDateTime completionDate;
    private PaymentStatus paymentStatus;
    private List<Person> members;
    private List<MemberBasedFee> memberBasedFees;
    private MemberBasedFee chiefSurgeryFee;

    public Surgery(ParamSurgery paramSurgery) {
        this.practice = paramSurgery.getPractice();
        this.centre = this.practice.getCentre();
        this.specialty = this.practice.getSpecialty();
        this.healthInsurance = this.practice.getHealthInsurance();
        this.price = paramSurgery.getPractice().getPrice();
        this.completionDate = paramSurgery.getCompletionDate();
        this.paymentStatus = PaymentStatus.PENDING;
        this.members = paramSurgery.getMembers();
        this.memberBasedFees = paramSurgery.getMemberBasedFees();
        this.detail = paramSurgery.getDetail();
        this.chiefSurgeryFee = new MemberBasedFee(paramSurgery.getChiefSurgery());
    }
}
