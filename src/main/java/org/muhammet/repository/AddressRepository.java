package org.muhammet.repository;

import org.muhammet.repository.entity.Address;
import org.muhammet.utility.MyFactoryRepository;

public class AddressRepository extends MyFactoryRepository<Address,Long> {
    public AddressRepository(){
        super(new Address());
    }
}
