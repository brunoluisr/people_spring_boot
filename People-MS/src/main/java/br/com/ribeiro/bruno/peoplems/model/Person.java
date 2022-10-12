package br.com.ribeiro.bruno.peoplems.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    private UUID id;
    private String name;
    private String surname;


}
