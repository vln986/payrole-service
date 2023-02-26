package com.employee.controller;
import com.employee.collection.Payrole;
import com.employee.service.PayroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PayroleController {

    @Autowired
    PayroleService payroleService;

    @GetMapping("/getPayroleInfo/{employeeId}")
    public ResponseEntity<Payrole> getPayrole(@PathVariable("employeeId") String employeeId){
        try{
            Payrole payroleInfo = payroleService.getPayroleInfo(employeeId);
            return new ResponseEntity<>(payroleInfo, HttpStatus.OK);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
