package domain.cirugias;

import domain.cirugias.honorarios.HonorarioPorRol;
import domain.personas.ObraSocial;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Practica {
    private Centro centro;
    private Especialidad especialidad;
    private ObraSocial obraSocial;
    private Float precio;
    private List<HonorarioPorRol> honorariosPorRol;

    public Practica(ParamPractica paramPractica) {
        this.centro = paramPractica.getCentro();
        this.especialidad = paramPractica.getEspecialidad();
        this.obraSocial = paramPractica.getObraSocial();
        this.precio = paramPractica.getPrecio();
        this.honorariosPorRol = paramPractica.getHonorariosPorRol();
    }
}
