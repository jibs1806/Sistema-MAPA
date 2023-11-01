package domain.surgery.fees.criteria;

import domain.surgery.Practice;

public class PercentageBasedBilling implements BillingCriteria {

    private Double percentage;

    public PercentageBasedBilling(Double percentage) {
        this.percentage = percentage;
    }

    public Double cuantoCobra(Practice practica){
        return practica.getPrecio() * percentage;
    }
}
