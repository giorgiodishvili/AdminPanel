package com.george.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {
    @GetMapping("/vehicleHires")
    public String getVehicleHires(){
        return "vehicleHire";
    }
}
