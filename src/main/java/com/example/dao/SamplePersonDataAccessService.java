package com.example.dao;

import com.example.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SamplePersonDataAccessService implements PersonDao {

     private static List<Person> DB= new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
       DB.add(new Person(id, person.getName()));
       //DB.add(new Person(UUID));
        // this is just sampling commenting
        return 0;
    }



}
