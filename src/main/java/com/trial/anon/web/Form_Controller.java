package com.trial.anon.web;


import com.trial.anon.person.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Form_Controller {
    @GetMapping("/add_person")
    public String show_new_person_form(Model model){
        //this controller will handle the creation of a new person object
        model.addAttribute("person", new Person());
        return "add_person";
    }

    @PostMapping("add_person")
    public String new_person(){

        return "temp";
    }
}
