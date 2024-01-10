package org.mapa.MAPA.domain.surgery;


import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Payment;
import org.mapa.MAPA.domain.surgery.surgeryDetail.SurgeryDetail;

import java.util.List;

@Getter @Setter
public class ParamSurgery {

    private SurgeryDetail surgeryDetail;

    private Payment payment;

    private List<Specialist> members;


    private List<MemberBasedFee> memberBasedFees;

    private Specialist chiefSurgery;

    private Double chiefSurgeryFee;

    public ParamSurgery(){
        this.payment = new Payment();
        this.surgeryDetail = new SurgeryDetail();
    }
}
