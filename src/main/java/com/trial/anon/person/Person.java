package com.trial.anon.person;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "person_id")
    private int person_id;
    @Column (name = "person_name")
    private String name;
    @Column (name = "person_email")
    private String email;
    @Column (name = "person_dob")
    private LocalDate dob;

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString(){
        return this.person_id+" "+this.name+" "+this.email+" "+this.dob;

    }

}
