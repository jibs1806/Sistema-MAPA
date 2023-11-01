package domain.cirugias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Especialidad {
    private String nombre;

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }
}
