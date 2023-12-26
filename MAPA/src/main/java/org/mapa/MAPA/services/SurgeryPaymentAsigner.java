package org.mapa.MAPA.services;

import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter @Setter
public class SurgeryPaymentAsigner {
    public static void calculatePayments(Surgery surgery){
        List<MemberBasedFee> memberPayments = calculateAllMemberPayments(surgery.getPractice(), surgery.getMembers());
        surgery.setMemberBasedFees(memberPayments);

        Double allMembersAmount = memberPayments.stream().mapToDouble(MemberBasedFee::getAssignedAmount).sum();

        surgery.getChiefSurgeryFee().setAssignedAmount(surgery.getPrice() - allMembersAmount);
    }
    public static List<MemberBasedFee> calculateAllMemberPayments(Practice practice, List <Person> members) {
            List<MemberBasedFee> asignedMembersPayments = new ArrayList<>();

            members.forEach(person -> asignedMembersPayments.add(calculateMemberPayment(practice, person)));

            return asignedMembersPayments;
    }

    public static MemberBasedFee calculateMemberPayment(Practice practice, Person member){
        MemberBasedFee asignedPayment = new MemberBasedFee(member);

        Double howMuch = practice.getRoleBasedFees().stream()
                .filter(rolFee -> rolFee.getSurgeryRole() == member.getSurgeryRole())
                .findFirst().get().getPercentage() * practice.getPrice();

        asignedPayment.setAssignedAmount(howMuch);

        return asignedPayment;
    }
}
