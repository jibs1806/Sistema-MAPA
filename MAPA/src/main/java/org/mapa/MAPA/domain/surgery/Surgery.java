package org.mapa.MAPA.domain.surgery;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Payment;
import org.mapa.MAPA.domain.surgery.surgeryDetail.SurgeryDetail;
import org.mapa.MAPA.persistence.Persistent;

import java.util.List;

@Entity
@Table(name = "surgery")
@Getter @Setter
public class Surgery extends Persistent {

    @Embedded
    private SurgeryDetail surgeryDetail;

    @Embedded
    private Payment payment;

    @ManyToMany
    @JoinTable(
            name = "Members",
            joinColumns = @JoinColumn(name = "surgery_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Specialist> members;

    @OneToMany
    private List<MemberBasedFee> memberBasedFees;

    @ManyToOne
    @JoinColumn(name = "chiefSurgery_id", referencedColumnName = "id")
    private Specialist chiefSurgery;

    @Column(name = "chiefSurgeryFee")
    private Double chiefSurgeryFee;

    public Surgery(ParamSurgery paramSurgery) {
        this.surgeryDetail = paramSurgery.getSurgeryDetail();
        this.payment = paramSurgery.getPayment();
        this.members = paramSurgery.getMembers();
        this.memberBasedFees = paramSurgery.getMemberBasedFees();
        this.chiefSurgeryFee = paramSurgery.getChiefSurgeryFee();
        this.chiefSurgery = paramSurgery.getChiefSurgery();
    }

    public Surgery() {

    }
}
