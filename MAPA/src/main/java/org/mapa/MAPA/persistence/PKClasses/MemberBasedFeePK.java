package org.mapa.MAPA.persistence.PKClasses;

import java.io.Serializable;
import java.util.Objects;

public class MemberBasedFeePK implements Serializable {
    private Long person;
    private Long surgery;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberBasedFeePK that = (MemberBasedFeePK) o;
        return Objects.equals(person, that.person) &&
                Objects.equals(surgery, that.surgery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, surgery);
    }

    public MemberBasedFeePK() {

    }
}
