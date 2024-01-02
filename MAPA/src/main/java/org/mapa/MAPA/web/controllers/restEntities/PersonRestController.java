package org.mapa.MAPA.web.controllers.restEntities;


import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.PersonService;
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
