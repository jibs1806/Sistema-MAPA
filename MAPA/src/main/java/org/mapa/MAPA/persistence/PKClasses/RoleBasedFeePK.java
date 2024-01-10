package org.mapa.MAPA.persistence.PKClasses;

import java.io.Serializable;
import java.util.Objects;

public class RoleBasedFeePK implements Serializable {
    private Long practice;
    private Long surgeryRole;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleBasedFeePK that = (RoleBasedFeePK) o;
        return Objects.equals(practice, that.practice) &&
                Objects.equals(surgeryRole, that.surgeryRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(practice, surgeryRole);
    }

    public RoleBasedFeePK(){

    }
}
