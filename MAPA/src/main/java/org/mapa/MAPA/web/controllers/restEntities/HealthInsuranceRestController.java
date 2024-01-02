package org.mapa.MAPA.web.controllers.restEntities;

import org.mapa.MAPA.domain.people.HealthInsurance;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.HealthInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/healthInsurance")
public class HealthInsuranceRestController extends BaseRestController<HealthInsurance> {

    @Autowired
    private HealthInsuranceService healthInsuranceService;

    @Override
    protected BaseService getService() {
        return this.healthInsuranceService;
    }
}
