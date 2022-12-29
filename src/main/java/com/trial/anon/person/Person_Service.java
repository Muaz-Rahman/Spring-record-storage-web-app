package com.trial.anon.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Person_Service {
    private final Person_Repository personRepository;

    @Autowired
    public Person_Service(Person_Repository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> get_list_of_persons(){
        Iterable<Person> persons = personRepository.findAll();
        List<Person> person_list= new ArrayList<>();
        for (Person person:persons) {
            person_list.add(person);
        }
        return person_list;
    }

}
