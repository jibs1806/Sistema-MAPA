package domain.cirugias.honorarios;

import domain.personas.RolEnCirugia;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HonorarioPorRol {
    private RolEnCirugia rolEnCirugia;
    private Float valor;

    public HonorarioPorRol(RolEnCirugia rolEnCirugia, Float valor) {
        this.rolEnCirugia = rolEnCirugia;
        this.valor = valor;
    }
}
