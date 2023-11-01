package domain.cirugias.honorarios.criterio;

import domain.cirugias.Practica;

public class CobrarPorPorcentaje implements CriterioCobro{

    private Double porcentaje;

    public CobrarPorPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double cuantoCobra(Practica practica){
        return practica.getPrecio() * porcentaje;
    }
}
