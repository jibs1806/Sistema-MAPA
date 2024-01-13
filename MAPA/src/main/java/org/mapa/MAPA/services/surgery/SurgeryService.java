package org.mapa.MAPA.services.surgery;

import lombok.Getter;
import lombok.Setter;
import org.mapa.MAPA.domain.agents.users.people.Person;
import org.mapa.MAPA.domain.agents.users.people.Specialist;
import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.practice.Practice;
import org.mapa.MAPA.domain.surgery.surgeryDetail.Specialty;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.surgery.SurgeryRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Getter @Setter
public class SurgeryService extends BaseService<Surgery> {

    @Autowired
    private SurgeryRepository surgeryRepository;

    @Override
    protected BaseRepository<Surgery> getRepository() {
        return this.surgeryRepository;
    }


}
