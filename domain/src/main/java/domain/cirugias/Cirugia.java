package domain.cirugias;

import domain.cirugias.honorarios.HonorarioPorIntegrante;
import domain.personas.ObraSocial;
import domain.personas.Persona;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class Cirugia {
    private Practica practica;
    private Centro centro;
    private ObraSocial obraSocial;
    private Especialidad especialidad;
    private Float precio;
    private LocalDateTime fechaPago;
    private LocalDateTime fechaRealizacion;
    private EstadoPago estadoPago;
    private List <Persona> integrantes;
    private List<HonorarioPorIntegrante> honorariosDeIntegrantes;

    public Cirugia(ParamCirugia paramCirugia) {
        this.practica = paramCirugia.getPractica();
        this.centro = this.practica.getCentro();
        this.especialidad = this.practica.getEspecialidad();
        this.obraSocial = this.practica.getObraSocial();
        this.precio = paramCirugia.getPrecio();
        this.fechaRealizacion = paramCirugia.getFechaRealizacion();
        this.estadoPago = EstadoPago.EN_ESPERA;
        this.integrantes = paramCirugia.getIntegrantes();
        this.honorariosDeIntegrantes = paramCirugia.getHonorariosDeIntegrantes();
    }
}
