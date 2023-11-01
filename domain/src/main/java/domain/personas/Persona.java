package domain.personas;

public class Persona {
    private Usuario usuario;
    private String nombre;
    private RolEnCirugia rolEnCirugia;

    public Persona(Usuario usuario, String nombre, RolEnCirugia rolEnCirugia) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.rolEnCirugia = rolEnCirugia;
    }
}
