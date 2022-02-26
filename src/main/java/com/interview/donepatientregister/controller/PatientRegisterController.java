package com.interview.donepatientregister.controller;

import com.interview.donepatientregister.entity.PatientRegister;
import com.interview.donepatientregister.service.PatientRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
//@CrossOrigin(origins = "http://localhost:8080")
public class PatientRegisterController {
    @Autowired
    PatientRegisterService patientRegisterService;

    @GetMapping("/patients")
    public List<PatientRegister>getAllPatients(){
        return  patientRegisterService.getPatients();
    }
    @PostMapping("/patients/register")
    public void registerPatient(@RequestBody PatientRegister patientRegister){
        patientRegisterService.registerPatient(patientRegister);

    }
}
