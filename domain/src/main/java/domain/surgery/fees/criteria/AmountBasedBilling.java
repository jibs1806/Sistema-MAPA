package domain.surgery.fees.criteria;

import domain.surgery.Practice;

public class AmountBasedBilling implements BillingCriteria {
    private Double amount;

    public AmountBasedBilling(Double amount) {
        this.amount = amount;
    }

    public Double cuantoCobra(Practice practice){
        return amount;
    }
}
