package br.com.ribeiro.bruno.peoplems.service;

import br.com.ribeiro.bruno.peoplems.dao.PersonDao;
import br.com.ribeiro.bruno.peoplems.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
