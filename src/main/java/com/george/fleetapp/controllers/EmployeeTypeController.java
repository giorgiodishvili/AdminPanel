package com.george.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
    @GetMapping("/employeeTypes")
    public String getEmployeeType(){
        return "employeeType";
    }
}
