package org.mapa.MAPA.services;

import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.SurgeryRepository;
import org.mapa.MAPA.services.exception.SurgeryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SurgeryService extends BaseService<Surgery> {

    @Autowired
    private SurgeryRepository surgeryRepository;
    @Override
    protected BaseRepository<Surgery> getRepository() {
        return this.surgeryRepository;
    }

}
