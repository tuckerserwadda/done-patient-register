package com.interview.donepatientregister.repository;

import com.interview.donepatientregister.entity.PatientRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRegisterRepository extends JpaRepository<PatientRegister, Long> {

}
