package com.interview.donepatientregister.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "patient_register_tbl")
public class PatientRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;

     @Column(name = "first_name")
    private String firstName;
     @Column(name = "last_name")
    private String lastName;
     @Column(name = "date_of_birth")
    private String DOB;
     @Column(name = "phone_number")
    private String phoneNumber;
     @Column(name = "email_Address")
    private String email;
     @Column(name="resident_address")
    private String address;
     @Column(name = "driver_license")
    private  String driverLicense;
     @Column(name = "appointment_time")
    private String appointmentTime;
}
