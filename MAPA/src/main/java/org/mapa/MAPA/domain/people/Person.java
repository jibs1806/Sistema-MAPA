package org.mapa.MAPA.domain.people;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.people.user.User;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "Person")
@Getter @Setter
public class Person extends Persistent {

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "name")
    private String name;

    @Column(name = "surgeryRole")
    private String surgeryRole;

    public Person(User user, String name, String surgeryRole) {
        this.user = user;
        this.name = name;
        this.surgeryRole = surgeryRole;
    }

    public Person() {

    }
}
