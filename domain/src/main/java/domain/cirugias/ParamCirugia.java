package domain.cirugias;

import domain.cirugias.honorarios.HonorarioPorIntegrante;
import domain.personas.Persona;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class ParamCirugia {
    private Practica practica;
    private Float precio;
    private LocalDateTime fechaRealizacion;
    private List<Persona> integrantes;
    private List<HonorarioPorIntegrante> honorariosDeIntegrantes;

    public ParamCirugia(){
        
    }
}
