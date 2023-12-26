package org.mapa.MAPA.domain.surgery;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table
@Getter @Setter
public class Specialty extends Persistent {
    private String name;

    public Specialty(String name) {
        this.name = name;
    }

    public Specialty() {

    }
}
