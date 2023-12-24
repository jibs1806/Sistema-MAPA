package org.mapa.MAPA.domain.people;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
    private User user;
    private String name;
    private SurgeryRole surgeryRole;

    public Person(User user, String name, SurgeryRole surgeryRole) {
        this.user = user;
        this.name = name;
        this.surgeryRole = surgeryRole;
    }
}
