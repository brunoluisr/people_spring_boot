package br.com.ribeiro.bruno.peoplems;

import br.com.ribeiro.bruno.peoplems.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("people")
public class PeopleController {

    @GetMapping
    public String index() {
        return "Hello, World!";
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        Person updatedPerson = person.builder()
                .id(UUID.randomUUID())
                .name(person.getName())
                .surname(person.getSurname()).build();
        return ResponseEntity.ok(updatedPerson);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Person people) {
        Person updatedPerson = people.builder()
                .id(UUID.randomUUID())
                .name(people.getName() + " Atualizado")
                .surname(people.getSurname() + " Novamente Atualizado")
                .build();
        return ResponseEntity.ok(updatedPerson);
    }
}