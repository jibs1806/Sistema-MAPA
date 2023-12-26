package org.mapa.MAPA.domain.people;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "HealthInsurence")
@Getter
@Setter
public class HealthInsurance extends Persistent {
    @Column(name = "name")
    private String name;

    public HealthInsurance(String name) {
        this.name = name;
    }

    public HealthInsurance() {

    }
}
