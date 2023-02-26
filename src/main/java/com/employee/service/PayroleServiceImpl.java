package com.employee.service;

import com.employee.DAO.PayroleDAO;
import com.employee.collection.Payrole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayroleServiceImpl implements PayroleService {

    @Autowired
    PayroleDAO payroleDAO;
    public Payrole getPayroleInfo(String employeeId){
        Payrole payroleInfo = null;
        try{
            payroleInfo = payroleDAO.getPayroleInfoByemployeeId(employeeId);
        }catch (Exception e){
            e.getMessage();
        }
        return payroleInfo;
    }
}
