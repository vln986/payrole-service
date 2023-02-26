package com.employee.DAO;

import com.employee.collection.Payrole;
import com.employee.repository.PayroleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PayroleDAOImpl implements PayroleDAO {

    @Autowired
    PayroleRepository payroleRepository;

    public Payrole getPayroleInfoByemployeeId(String employeeId) {
        Payrole payroleInfo = null;
        try{
            payroleInfo = payroleRepository.findByemployeeId(employeeId);
        }catch (Exception e){
            e.getMessage();
        }
        return payroleInfo;
    }
}
