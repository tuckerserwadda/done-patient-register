package com.interview.donepatientregister.service;

import com.interview.donepatientregister.entity.PatientRegister;
import com.interview.donepatientregister.repository.PatientRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientRegisterService {
    @Autowired
    private PatientRegisterRepository patientRegisterRepository;
    public List<PatientRegister> getPatients(){
        return patientRegisterRepository.findAll();
    }
    public  void registerPatient(PatientRegister patientRegister){
        patientRegisterRepository.save(patientRegister);
    }
}
