package BLBR.REPRO.COM.PeopleMS.service;

import BLBR.REPRO.COM.PeopleMS.dao.PersonDao;
import BLBR.REPRO.COM.PeopleMS.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
