package org.muhammet.repository;

import org.muhammet.repository.entity.Department;
import org.muhammet.utility.MyFactoryRepository;

public class DepartmentRepository extends MyFactoryRepository<Department,Long> {
    public DepartmentRepository(){
        super(new Department());
    }
}
