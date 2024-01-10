package org.mapa.MAPA.web.controllers.rest.people;


import org.mapa.MAPA.domain.agents.users.people.Person;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.people.PersonService;
import org.mapa.MAPA.web.controllers.rest.BaseRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/person")
public class PersonRestController extends BaseRestController<Person> {

    @Autowired
    private PersonService personService;

    @Override
    protected BaseService getService() {
        return this.personService;
    }
}
