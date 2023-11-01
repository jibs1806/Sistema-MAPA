package domain.personas;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Usuario {
    private String nombreUsuario;
    private String contrasenia;
    private String email;
    private RolEnSistema rolEnSistema;

    public Usuario(String nombreUsuario, String contrasenia, String email, RolEnSistema rolEnSistema) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.rolEnSistema = rolEnSistema;
    }
}
