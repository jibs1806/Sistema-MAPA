package org.mapa.MAPA.domain.surgery.surgeryDetail;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
    private String detail;


    private Patient patient;

    private Practice practice;

    private HealthInsurance healthInsurance;

    private Centre centre;

    private Specialty specialty;

    private ZonedDateTime completionDate;

    public SurgeryDetail(String detail, Patient patient, Practice  practice, ZonedDateTime completionDate) {
        this.detail = detail;
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
