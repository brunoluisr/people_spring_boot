package br.com.ribeiro.bruno.peoplems.dao;

import br.com.ribeiro.bruno.peoplems.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService  implements PersonDao {

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.getSurname()));
        return 1;
    }
}
