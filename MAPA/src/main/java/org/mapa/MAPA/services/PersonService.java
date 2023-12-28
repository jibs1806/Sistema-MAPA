package org.mapa.MAPA.services;

import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService extends BaseService<Person>{
    @Autowired
    private PersonRepository personRepository;

    @Override
    protected BaseRepository<Person> getRepository() {
        return this.personRepository;
    }

}
