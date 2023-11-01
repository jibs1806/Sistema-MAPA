package domain.cirugias;

import domain.cirugias.honorarios.HonorarioPorRol;
import domain.personas.ObraSocial;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ParamPractica {
    private Centro centro;
    private Especialidad especialidad;
    private ObraSocial obraSocial;
    private Float precio;
    private List<HonorarioPorRol> honorariosPorRol;

    public ParamPractica(){

    }
}
