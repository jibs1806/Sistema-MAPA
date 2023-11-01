package domain.surgery.fees;

import domain.surgery.Practice;
import domain.surgery.fees.criteria.BillingCriteria;
import domain.people.Person;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberBasedFee {
    private Person person;
    private Float cuantoCorresponde;
    private BillingCriteria criterioCobro;

    public MemberBasedFee(Person person, Float cuantoCorresponde, BillingCriteria criterioCobro) {
        this.person = person;
        this.cuantoCorresponde = cuantoCorresponde;
        this.criterioCobro = criterioCobro;
    }

    public Double cuantoCorresponde(Practice practica){
        return this.criterioCobro.cuantoCobra(practica);
    }
}
