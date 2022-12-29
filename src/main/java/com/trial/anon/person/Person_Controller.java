package com.trial.anon.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class Person_Controller {
    private final Person_Service personService;

    @Autowired
    public Person_Controller(Person_Service personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/persons_list", method = RequestMethod.GET)
    public String get_Persons(Model model){
        List<Person> persons= personService.get_list_of_persons();
        model.addAttribute("persons",persons);
        return "persons_list";
    }
}
