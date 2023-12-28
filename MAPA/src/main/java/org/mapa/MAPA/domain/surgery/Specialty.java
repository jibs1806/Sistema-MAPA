package org.mapa.MAPA.domain.surgery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "Specialty")
@Getter @Setter
public class Specialty extends Persistent {
    @Column(name = "name")
    private String name;

    public Specialty(String name) {
        this.name = name;
    }

    public Specialty() {

    }
}
