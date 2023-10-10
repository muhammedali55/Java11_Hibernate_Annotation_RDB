package org.muhammet.repository;

import org.muhammet.repository.entity.Person;
import org.muhammet.utility.MyFactoryRepository;

public class PersonRepository extends MyFactoryRepository<Person,Long> {
    public PersonRepository(){
        super(new Person());
    }
}
