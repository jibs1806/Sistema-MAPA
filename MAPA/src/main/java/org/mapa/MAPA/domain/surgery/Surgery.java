package org.mapa.MAPA.domain.surgery;

import jakarta.persistence.*;
import org.mapa.MAPA.domain.people.HealthInsurance;
import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.persistence.Persistent;
import org.mapa.MAPA.persistence.converter.ZonedDateTimeConverter;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table()
@Getter @Setter
public class Surgery extends Persistent {

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "practice_id", referencedColumnName = "id")
    private Practice practice;

    @ManyToOne
    @JoinColumn(name = "centre_id", referencedColumnName = "id")
    private Centre centre;

    @ManyToOne
    @JoinColumn(name = "healthInsurance_id", referencedColumnName = "id")
    private HealthInsurance healthInsurance;

    @ManyToOne
    @JoinColumn(name = "specialty_id", referencedColumnName = "id")
    private Specialty specialty;

    @Column(name = "price")
    private Double price;

    @Convert(converter = ZonedDateTimeConverter.class)
    @Column(name = "paymentDate")
    private ZonedDateTime paymentDate;

    @Convert(converter = ZonedDateTimeConverter.class)
    @Column(name = "completionDate")
    private ZonedDateTime completionDate;

    @Column(name = "paymentStatus")
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToMany
    @JoinTable(
            name = "Members",
            joinColumns = @JoinColumn(name = "surgery_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> members;

    @OneToMany(mappedBy = "surgery")
    @Transient
    private List<MemberBasedFee> memberBasedFees;

    @ManyToOne
    @JoinColumn(name = "chiefSurgeryFee_id", referencedColumnName = "id")
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

    public Surgery() {

    }
}
