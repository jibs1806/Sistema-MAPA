package org.mapa.MAPA.services.surgery;

import org.mapa.MAPA.domain.agents.HealthInsurance;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.surgery.HealthInsuranceRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HealthInsuranceService extends BaseService<HealthInsurance> {
    @Autowired
    private HealthInsuranceRepository healthInsuranceRepository;

    @Override
    protected BaseRepository<HealthInsurance> getRepository() {
        return this.healthInsuranceRepository;
    }
}
