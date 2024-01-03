package org.mapa.MAPA.services.surgery;

import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.surgery.PracticeRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeService extends BaseService<Practice> {

    @Autowired
    private PracticeRepository practiceRepository;
    @Override
    protected BaseRepository<Practice> getRepository() {
        return this.practiceRepository;
    }
}
