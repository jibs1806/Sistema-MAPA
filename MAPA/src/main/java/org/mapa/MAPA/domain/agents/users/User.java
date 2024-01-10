package org.mapa.MAPA.domain.agents.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.roles.SystemRole;
import org.mapa.MAPA.persistence.Persistent;

@Entity
@Table(name = "User")
@Getter @Setter
public class User extends Persistent{
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "systemRole")
    @Enumerated(EnumType.STRING)
    private SystemRole systemRole;

    public User(String userName, String password, String email, SystemRole systemRole) {
        this.username = userName;
        this.password = password;
        this.email = email;
        this.systemRole = systemRole;
    }

    public User() {

    }
}
