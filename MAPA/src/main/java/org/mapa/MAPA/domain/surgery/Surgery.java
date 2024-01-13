package org.mapa.MAPA.domain.surgery;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.HealthInsurance;
import org.mapa.MAPA.domain.agents.users.people.Patient;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Centre;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Payment;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Specialty;
import org.mapa.MAPA.domain.surgery.surgeryDetail.SurgeryDetail;
import org.mapa.MAPA.persistence.Persistent;

import java.time.ZonedDateTime;
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


    public Surgery() {

    }

    public String getDescription(){
        return this.surgeryDetail.getDescription();
    }

    public void setDescription(String description){
        this.surgeryDetail.setDescription(description);
    }

    public Patient getPatient(){
        return this.surgeryDetail.getPatient();
    }

    public void setPatient(Patient patient){
        this.surgeryDetail.setPatient(patient);
    }

    public Practice getPractice(){
        return this.surgeryDetail.getPractice();
    }

    public void setPractice(Practice practice){
        this.surgeryDetail.setPractice(practice);
    }

    public HealthInsurance getHealthInsurance(){
        return this.surgeryDetail.getHealthInsurance();
    }

    public void setHealthInsurance(HealthInsurance healthInsurance){
        this.surgeryDetail.setHealthInsurance(healthInsurance);
    }

    public Centre getCentre(){
        return this.surgeryDetail.getCentre();
    }

    public void setCentre(Centre centre){
        this.surgeryDetail.setCentre(centre);
    }

    public Specialty getSpecialty(){
        return this.surgeryDetail.getSpecialty();
    }

    public void setSpecialty(Specialty specialty){
        this.surgeryDetail.setSpecialty(specialty);
    }

    public ZonedDateTime getCompletionDate(){
        return this.surgeryDetail.getCompletionDate();
    }

    public void setCompletionDate(ZonedDateTime CompletionDate){
        this.surgeryDetail.setCompletionDate(CompletionDate);
    }

}
