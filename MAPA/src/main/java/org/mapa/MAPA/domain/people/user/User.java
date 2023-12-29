package org.mapa.MAPA.domain.people.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
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
    private String systemRole;

    public User(String userName, String password, String email, String systemRole) {
        this.username = userName;
        this.password = password;
        this.email = email;
        this.systemRole = systemRole;
    }

    public User() {

    }
}
