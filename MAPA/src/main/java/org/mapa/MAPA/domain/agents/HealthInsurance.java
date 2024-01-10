package org.mapa.MAPA.domain.agents;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.roles.SystemRole;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "HealthInsurence")
@Getter
@Setter
public class HealthInsurance extends Persistent {
    @Column(name = "name")
    private SystemRole name;

    public HealthInsurance(SystemRole name) {
        this.name = name;
    }

    public HealthInsurance() {

    }
}
