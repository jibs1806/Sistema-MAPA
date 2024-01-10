package org.mapa.MAPA.domain.agents.users.people;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.User;
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

    public Person(User user, String name) {
        this.user = user;
        this.name = name;
    }

    public Person() {

    }
}
