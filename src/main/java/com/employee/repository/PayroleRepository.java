package com.employee.repository;

import com.employee.collection.Payrole;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayroleRepository extends MongoRepository<Payrole, String> {

    public Payrole findByemployeeId(String employeeId);
}
