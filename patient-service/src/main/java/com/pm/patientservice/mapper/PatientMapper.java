package com.pm.patientservice.mapper;

import com.pm.patientservice.DTO.PatientRequestDTO;
import com.pm.patientservice.DTO.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper { // Mapper class is used to return the dedicated DTO to the client
    public static PatientResponseDTO toDTO(Patient patient)
    {
        PatientResponseDTO patientDTO = new PatientResponseDTO();  // object for the PatientResponseDTO
        patientDTO.setId(patient.getId().toString());// converts the type of the id to string and set its to DTO
        patientDTO.setName(patient.getName());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO; // returning the object
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO){  // for creating new patient
        Patient patient = new Patient();           // creates the new object
        patient.setName(patientRequestDTO.getName()); // new pbject's name is created by the patientRequestDto object
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patient.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth())); // patient is instance of the patient model class so the DOB should be in LocalDate  but in the patientRequestDTO it is in String so we convert it to localDate by parsing
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));

        return patient ;
    }

}
