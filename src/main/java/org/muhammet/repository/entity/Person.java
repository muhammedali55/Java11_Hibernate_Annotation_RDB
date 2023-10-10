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
@Table(name = "tbl_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer age;

    /**
     * bir personelin çalıştığı departman bilgisini
     * nasıl çekebiliriz?
     *
     */
    /**
     *
     * LAZY     ->
     * EAGER    ->
     *
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Bu_id_nin_kolon_adini_ben_yazdim")
    Department department;

//    @OneToMany(mappedBy = "person")
//    List<Address> addressList;

    @ManyToMany(mappedBy = "personList")
    List<Address> addressList;

}
