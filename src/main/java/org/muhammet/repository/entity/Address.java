package org.muhammet.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String city;
    Integer zipCode;
    String street;
    Integer number;

//    @ManyToOne
//    Person person;

    @ManyToMany
    @JoinTable(
            name = "tbl_person_address",
            joinColumns = {@JoinColumn(name = "adres_id")},
            inverseJoinColumns = {@JoinColumn(name = "personel_id")}
    )
    List<Person> personList;

}
