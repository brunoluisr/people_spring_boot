package BLBR.REPRO.COM.PeopleMS.dao;

import BLBR.REPRO.COM.PeopleMS.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
