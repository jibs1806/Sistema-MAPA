package domain.surgery;

import domain.people.Person;
import domain.surgery.fees.MemberBasedFee;
import domain.surgery.practice.Practice;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class SurgeryPaymentAsigner {
    public static void asignPayments(Surgery surgery){
        List<MemberBasedFee> memberPayments = asignAllMemberPayments(surgery.getPractice(), surgery.getMembers());
        surgery.setMemberBasedFees(memberPayments);

        Double allMembersAmount = memberPayments.stream().mapToDouble(MemberBasedFee::getAssignedAmount).sum();

        surgery.getChiefSurgeryFee().setAssignedAmount(surgery.getPrice() - allMembersAmount);
    }
    public static List<MemberBasedFee> asignAllMemberPayments(Practice practice, List <Person> members) {
            List<MemberBasedFee> asignedMembersPayments = new ArrayList<>();

            members.forEach(person -> asignedMembersPayments.add(asignMemberPayment(practice, person)));

            return asignedMembersPayments;
    }

    public static MemberBasedFee asignMemberPayment(Practice practice, Person member){
        MemberBasedFee asignedPayment = new MemberBasedFee(member);

        Double howMuch = practice.getRoleBasedFees().stream()
                .filter(rolFee -> rolFee.getSurgeryRole() == member.getSurgeryRole())
                .findFirst().get().getPercentage() * practice.getPrice();

        asignedPayment.setAssignedAmount(howMuch);

        return asignedPayment;
    }
}
