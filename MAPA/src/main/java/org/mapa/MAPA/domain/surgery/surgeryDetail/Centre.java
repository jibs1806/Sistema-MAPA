package org.mapa.MAPA.domain.surgery.surgeryDetail;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "Centre")
public class Centre extends Persistent {
    private String name;

    public Centre(String name) {
        this.name = name;
    }

    public Centre() {

    }
}
