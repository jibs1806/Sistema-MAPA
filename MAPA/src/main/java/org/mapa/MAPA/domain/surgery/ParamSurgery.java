package org.mapa.MAPA.domain.surgery;

import jakarta.persistence.Transient;
import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter @Setter
public class ParamSurgery {
    private String detail;
    private Practice practice;
    private ZonedDateTime completionDate;
    private List<Person> members;
    private List<MemberBasedFee> memberBasedFees;
    private Person chiefSurgery;

    public ParamSurgery(){
        
    }
}
