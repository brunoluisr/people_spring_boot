package br.com.ribeiro.bruno.peoplems.dao;

import br.com.ribeiro.bruno.peoplems.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
