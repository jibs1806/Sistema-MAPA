package org.mapa.MAPA.services;

import org.mapa.MAPA.domain.people.HealthInsurance;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.HealthInsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HealthInsuranceService extends BaseService<HealthInsurance>{
    @Autowired
    private HealthInsuranceRepository healthInsuranceRepository;

    @Override
    protected BaseRepository<HealthInsurance> getRepository() {
        return this.healthInsuranceRepository;
    }
}
