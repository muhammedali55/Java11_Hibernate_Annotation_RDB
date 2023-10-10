package org.muhammet.service;

import org.muhammet.repository.PersonRepository;
import org.muhammet.repository.entity.Person;
import org.muhammet.utility.MyFactoryService;

public class PersonelService extends MyFactoryService<PersonRepository,Person,Long> {
  public PersonelService(){
      super(new PersonRepository());
  }
}
