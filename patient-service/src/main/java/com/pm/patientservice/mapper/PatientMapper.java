package com.pm.patientservice.mapper;

import com.pm.patientservice.DTO.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
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
}
