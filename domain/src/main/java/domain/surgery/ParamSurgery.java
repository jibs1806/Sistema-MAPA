package domain.surgery;

import domain.surgery.fees.MemberBasedFee;
import domain.people.Person;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class ParamSurgery {
    private Practice practica;
    private Float precio;
    private LocalDateTime fechaRealizacion;
    private List<Person> integrantes;
    private List<MemberBasedFee> honorariosDeIntegrantes;

    public ParamSurgery(){
        
    }
}
