package org.mapa.MAPA.persistence.repositories.people;

import org.mapa.MAPA.domain.agents.users.people.Person;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<Person> {
}
