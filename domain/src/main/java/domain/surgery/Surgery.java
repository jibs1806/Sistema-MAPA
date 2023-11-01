package domain.surgery;

import domain.surgery.fees.MemberBasedFee;
import domain.people.HealthInsurance;
import domain.people.Person;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class Surgery {
    private Practice practica;
    private Centre centre;
    private HealthInsurance healthInsurance;
    private Specialty specialty;
    private Float precio;
    private LocalDateTime fechaPago;
    private LocalDateTime fechaRealizacion;
    private PaymentStatus estadoPago;
    private List <Person> integrantes;
    private List<MemberBasedFee> honorariosDeIntegrantes;

    public Surgery(ParamSurgery paramSurgery) {
        this.practica = paramSurgery.getPractica();
        this.centre = this.practica.getCentre();
        this.specialty = this.practica.getEspecialidad();
        this.healthInsurance = this.practica.getHealthInsurance();
        this.precio = paramSurgery.getPrecio();
        this.fechaRealizacion = paramSurgery.getFechaRealizacion();
        this.estadoPago = PaymentStatus.PENDING;
        this.integrantes = paramSurgery.getIntegrantes();
        this.honorariosDeIntegrantes = paramSurgery.getHonorariosDeIntegrantes();
    }
}
