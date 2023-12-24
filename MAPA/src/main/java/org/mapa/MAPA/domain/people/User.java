package org.mapa.MAPA.domain.people;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private String userName;

    private String password;

    private String email;

    private SystemRole systemRole;

    public User(String userName, String password, String email, SystemRole systemRole) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.systemRole = systemRole;
    }

    public User() {

    }
}
