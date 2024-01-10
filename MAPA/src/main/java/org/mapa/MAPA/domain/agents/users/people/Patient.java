package org.mapa.MAPA.domain.agents.users.people;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.persistence.Persistent;

import java.util.List;

@Entity
@Table(name = "Patient")
@Getter @Setter
public class Patient extends Persistent {
    private int age;

    private List<String> allergies;


}
