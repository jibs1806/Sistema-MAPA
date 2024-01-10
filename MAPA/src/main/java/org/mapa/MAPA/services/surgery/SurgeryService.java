package org.mapa.MAPA.services.surgery;

import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.people.Person;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Specialty;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.surgery.SurgeryRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Getter @Setter
public class SurgeryService extends BaseService<Surgery> {

    @Autowired
    private SurgeryRepository surgeryRepository;

    @Override
    protected BaseRepository<Surgery> getRepository() {
        return this.surgeryRepository;
    }

    public static void assignPayments(Surgery surgery){
        List<MemberBasedFee> memberPayments = assignAllMemberPayments(surgery.getSurgeryDetail().getPractice(), surgery.getMembers());
        surgery.setMemberBasedFees(memberPayments);

        Double allMembersAmount = memberPayments.stream().mapToDouble(MemberBasedFee::getAssignedAmount).sum();

        surgery.setChiefSurgeryFee(surgery.getPayment().getPrice() - allMembersAmount);
    }
    public static List<MemberBasedFee> assignAllMemberPayments(Practice practice, List <Specialist> members) {
            List<MemberBasedFee> asignedMembersPayments = new ArrayList<>();

            members.forEach(person -> asignedMembersPayments.add(assignMemberPayment(practice, person)));

            return asignedMembersPayments;
    }

    public static MemberBasedFee assignMemberPayment(Practice practice, Specialist member){
        MemberBasedFee asignedPayment = new MemberBasedFee(member);

        Double howMuch = practice.getRoleBasedFees().stream()
                .filter(rolFee -> rolFee.getSurgeryRole().equals(member.getSurgeryRole()))
                .findFirst().get().getPercentage() * practice.getPrice();

        asignedPayment.setAssignedAmount(howMuch);

        return asignedPayment;
    }
}
