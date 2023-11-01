package domain.cirugias.honorarios.criterio;

import domain.cirugias.Practica;

public class CobrarPorMonto implements CriterioCobro{
    private Double monto;

    public CobrarPorMonto(Double monto) {
        this.monto = monto;
    }

    public Double cuantoCobra(Practica practica){
        return monto;
    }
}
