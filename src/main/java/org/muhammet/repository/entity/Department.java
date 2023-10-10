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
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    /**
     * Lazy Loading
     * Eager Loading
     */
    @OneToMany(mappedBy = "department",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<Person> personList;
}
