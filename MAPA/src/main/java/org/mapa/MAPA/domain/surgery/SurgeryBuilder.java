package org.mapa.MAPA.domain.surgery;

import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Payment;
import org.mapa.MAPA.domain.surgery.surgeryDetail.SurgeryDetail;
import org.mapa.MAPA.domain.surgery.practice.Practice;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class SurgeryBuilder {

    private Surgery surgery = new Surgery();

    public Surgery buildSurgery(){
        return this.surgery;
    }

    public SurgeryBuilder initializeAttributes(){
        SurgeryDetail surgeryDetail = new SurgeryDetail();
        Payment payment = new Payment();
        List<MemberBasedFee> memberBasedFees = new ArrayList<>();

        this.surgery.setPayment(payment);
        this.surgery.setSurgeryDetail(surgeryDetail);
        this.surgery.setMemberBasedFees(memberBasedFees);

        return this;
    }
    public SurgeryBuilder setParamSurgery(ParamSurgery paramSurgery){
        this.surgery.getSurgeryDetail().setDescription(paramSurgery.getDescription());
        this.surgery.getSurgeryDetail().setPatient(paramSurgery.getPatient());
        this.surgery.getSurgeryDetail().setPractice(paramSurgery.getPractice());
        this.surgery.getSurgeryDetail().setCompletionDate(paramSurgery.getCompletionDate());

        this.surgery.setMembers(paramSurgery.getMembers());
        this.surgery.setChiefSurgery(paramSurgery.getChiefSurgery());

        return this;
    }


    public SurgeryBuilder finishSurgeryDetail(){

        Practice practice = this.surgery.getPractice();
        this.surgery.getSurgeryDetail().setHealthInsurance(practice.getHealthInsurance());
        this.surgery.getSurgeryDetail().setCentre(practice.getCentre());
        this.surgery.getSurgeryDetail().setSpecialty(practice.getSpecialty());

        return this;
    }

    public SurgeryBuilder assignFees(){

        List<Specialist> members = this.surgery.getMembers();

        Practice practice = this.surgery.getPractice();

        members.forEach(person -> this.surgery.getMemberBasedFees().add(this.assignMemberPayment(practice, person)));

        return this;
    }

    private MemberBasedFee assignMemberPayment(Practice practice, Specialist member){
        MemberBasedFee asignedPayment = new MemberBasedFee(member);

        Double howMuch = practice.getRoleBasedFees().stream()
                .filter(rolFee -> rolFee.getSurgeryRole().equals(member.getSurgeryRole()))
                .findFirst().get().getPercentage() * practice.getPrice();

        asignedPayment.setAssignedAmount(howMuch);

        return asignedPayment;
    }
}
