package org.muhammet.service;

import org.muhammet.repository.DepartmentRepository;
import org.muhammet.repository.entity.Department;
import org.muhammet.utility.MyFactoryService;

public class DepartmentService extends MyFactoryService<DepartmentRepository,Department,Long> {

    public DepartmentService(){
        super(new DepartmentRepository());
    }
}
