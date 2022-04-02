package com.devopsi.clinic.service;

import com.devopsi.clinic.entity.Patient;
import com.devopsi.clinic.repository.ClinicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClinicService {

    private  final ClinicRepository clinicRepository;

    public List<Patient> getPatient() {
        return clinicRepository.findAll();
    }

    public Patient getPatientById(long patientId){
        return clinicRepository.findById(patientId).orElseThrow();
    }

    public Patient addPatient(Patient patient){
        return clinicRepository.save(patient);
    }

    public void deletePatient(long patientId){
        clinicRepository.deleteById(patientId);
    }

    public  Patient updatePatient(long patientId, Patient patient){
        return clinicRepository.findById(patientId).map(patientToUpdate -> {
            patientToUpdate.setAddress(patient.getAddress());
            patientToUpdate.setFirstName(patient.getFirstName());
            patientToUpdate.setLastName(patient.getLastName());
            return clinicRepository.save(patient);
        }).orElseThrow();
    }


}
