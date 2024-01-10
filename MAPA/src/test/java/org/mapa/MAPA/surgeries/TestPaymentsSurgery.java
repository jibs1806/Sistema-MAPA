package org.mapa.MAPA.surgeries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.mapa.MAPA.domain.agents.users.people.Person;
import org.mapa.MAPA.domain.agents.roles.SurgeryRole;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.ParamSurgery;
import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.fees.RoleBasedFee;
import org.mapa.MAPA.domain.surgery.practice.ParamPractice;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.mapa.MAPA.services.surgery.SurgeryService;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaymentsSurgery {
    private List<Specialist> members;
    private Practice practice;
    private Surgery surgery;

    @BeforeEach
    public void init(){
        members = this.createTestMembers();
        practice = this.createTestPractice();
        surgery = this.createTestSurgery(members, practice);
    }

    public List<Specialist> createTestMembers(){
        Specialist chiefSurgeon = new Specialist(null, SurgeryRole.CHIEF_SURGERY);
        Specialist anesthetist = new Specialist(null, SurgeryRole.ANESTHESIST);
        Specialist auxiliarySurgeon = new Specialist(null, SurgeryRole.AUXILIARY_SURGEON);

        List<Specialist> members = new ArrayList<>();
        members.add(anesthetist);
        members.add(auxiliarySurgeon);

        return members;
    }

    public Practice createTestPractice(){
        RoleBasedFee auxiliarySurgeonFee = new RoleBasedFee(SurgeryRole.AUXILIARY_SURGEON, 0.2);
        RoleBasedFee anesthesisFee = new RoleBasedFee(SurgeryRole.ANESTHESIST, 0.3);

        List<RoleBasedFee> roleBasedFees = new ArrayList<>();

        roleBasedFees.add(auxiliarySurgeonFee);
        roleBasedFees.add(anesthesisFee);

        ParamPractice paramPractice = new ParamPractice(); // missing list of roleBasedFees

        paramPractice.setDetail("Heart transplant");
        paramPractice.setCentre(null);
        paramPractice.setSpecialty(null);
        paramPractice.setPrice(100.0);
        paramPractice.setRoleBasedFees(roleBasedFees);

        Practice practice = new Practice(paramPractice);


        return practice;
    }

    public Surgery createTestSurgery(List<Specialist> members, Practice practice){
        ParamSurgery paramSurgery = new ParamSurgery();

        ZonedDateTime completionDate = ZonedDateTime.now();

        paramSurgery.getSurgeryDetail().setCompletionDate(completionDate);
        paramSurgery.setMembers(members);
        paramSurgery.getSurgeryDetail().setPractice(practice);
        paramSurgery.getPayment().setPrice(practice.getPrice());

        Surgery surgeryTest = new Surgery(paramSurgery);

        return surgeryTest;
    }

    @Test
    @DisplayName("The chief of surgery gets asigned the remaining amount")
    public void chiefSurgeryPaymentAsignment(){

        SurgeryService.assignPayments(surgery);

        Double chiefSurgeryAssigned = surgery.getChiefSurgeryFee();

        assertEquals(50.0, chiefSurgeryAssigned);
    }

    @Test
    @DisplayName("Auxiliary surgeon gets asigned the correct amount")
    public void asignAuxiliarySurgeonPayment(){
        Specialist auxiliarySurgeon = new Specialist(null, SurgeryRole.AUXILIARY_SURGEON);

        MemberBasedFee auxiliarySurgeonFee = SurgeryService.assignMemberPayment(practice, auxiliarySurgeon);

        Double auxiliarySurgeonAssigned = auxiliarySurgeonFee.getAssignedAmount();

        assertEquals(20.0, auxiliarySurgeonAssigned);
    }

    @Test
    @DisplayName("All members get asigned the correct amount")
    public void asignAllMemberPayments(){
        List<MemberBasedFee> memberBasedFees = SurgeryService.assignAllMemberPayments(practice, members);

        Double anesthetistAssigned = memberBasedFees.get(0).getAssignedAmount();
        Double auxiliarySurgeonAssigned = memberBasedFees.get(1).getAssignedAmount();

        assertEquals(30.0, anesthetistAssigned);
        assertEquals(20.0, auxiliarySurgeonAssigned);
    }
}
