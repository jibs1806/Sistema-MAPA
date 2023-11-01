package domain.cirugias.honorarios;

import domain.cirugias.Practica;
import domain.cirugias.honorarios.criterio.CriterioCobro;
import domain.personas.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HonorarioPorIntegrante {
    private Persona persona;
    private Float cuantoCorresponde;
    private CriterioCobro criterioCobro;

    public HonorarioPorIntegrante(Persona persona, Float cuantoCorresponde, CriterioCobro criterioCobro) {
        this.persona = persona;
        this.cuantoCorresponde = cuantoCorresponde;
        this.criterioCobro = criterioCobro;
    }

    public Double cuantoCorresponde(Practica practica){
        return this.criterioCobro.cuantoCobra(practica);
    }
}
