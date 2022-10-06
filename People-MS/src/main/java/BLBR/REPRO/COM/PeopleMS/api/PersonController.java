package BLBR.REPRO.COM.PeopleMS.api;

import BLBR.REPRO.COM.PeopleMS.model.Person;
import BLBR.REPRO.COM.PeopleMS.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
