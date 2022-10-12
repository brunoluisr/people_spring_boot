package br.com.ribeiro.bruno.peoplems.api;

import br.com.ribeiro.bruno.peoplems.model.Person;
import br.com.ribeiro.bruno.peoplems.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
