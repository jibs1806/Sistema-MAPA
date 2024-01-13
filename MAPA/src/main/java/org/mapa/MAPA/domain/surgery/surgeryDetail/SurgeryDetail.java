package org.mapa.MAPA.domain.surgery.surgeryDetail;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.HealthInsurance;
import org.mapa.MAPA.domain.agents.users.people.Patient;
import org.mapa.MAPA.domain.surgery.practice.Practice;

import java.time.ZonedDateTime;
@Embeddable
@Getter @Setter
public class SurgeryDetail {

    @Column(name = "detail")
    private String description;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_patient_id"))
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "practice_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_practice_id"))
    private Practice practice;

    @ManyToOne
    @JoinColumn(name = "healthInsurance_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_healthInsurance_id"))
    private HealthInsurance healthInsurance;

    @ManyToOne
    @JoinColumn(name = "centre_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_centre_id"))
    private Centre centre;

    @ManyToOne
    @JoinColumn(name = "specialty_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_specialty_id"))
    private Specialty specialty;
    
    @Column(name = "completionDate")
    private ZonedDateTime completionDate;

    public SurgeryDetail(String description, Patient patient, Practice  practice, ZonedDateTime completionDate) {
        this.description = description;
        this.patient = patient;
        this.practice = practice;
        this.completionDate = completionDate;
        this.healthInsurance = this.practice.getHealthInsurance();
        this.centre = this.practice.getCentre();
        this.specialty = this.practice.getSpecialty();
    }

    public SurgeryDetail(){

    }
}
