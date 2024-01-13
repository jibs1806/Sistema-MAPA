package org.mapa.MAPA.domain.surgery;


import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.people.Patient;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.practice.Practice;

import java.time.ZonedDateTime;
import java.util.List;

@Getter @Setter
public class ParamSurgery {

    private Specialist chiefSurgery;

    private List<Specialist> members;

    private String description;

    private Patient patient;

    private Practice practice;

    private ZonedDateTime completionDate;

    public ParamSurgery(){
    }
}
