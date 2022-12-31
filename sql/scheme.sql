CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE person
(
    person_id    INTEGER NOT NULL,
    person_name  VARCHAR(255),
    person_email VARCHAR(255),
    person_dob   date,
    CONSTRAINT pk_person PRIMARY KEY (person_id)
);