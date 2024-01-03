package org.mapa.MAPA.services.surgery;

import org.mapa.MAPA.domain.surgery.Centre;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.surgery.CentreRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentreService extends BaseService<Centre> {

    @Autowired
    private CentreRepository centreRepository;

    @Override
    protected BaseRepository<Centre> getRepository() {
        return this.centreRepository;
    }
}
