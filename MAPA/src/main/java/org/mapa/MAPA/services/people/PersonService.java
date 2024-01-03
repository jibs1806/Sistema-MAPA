package org.mapa.MAPA.services.people;

import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.people.PersonRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService extends BaseService<Person> {
    @Autowired
    private PersonRepository personRepository;

    @Override
    protected BaseRepository<Person> getRepository() {
        return this.personRepository;
    }
}
