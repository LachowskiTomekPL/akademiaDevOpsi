package com.devopsi.clinic.controller;

import com.devopsi.clinic.entity.Patient;
import com.devopsi.clinic.service.ClinicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/clinic")
@RequiredArgsConstructor

public class ClinicController {

    private final ClinicService clinicService;

    @GetMapping(path = "/patient")
    public List<Patient> getPatient(){
        return clinicService.getPatient();
    }
    @GetMapping(path = "/patient/{patientId}")
    public Patient getSinglePatient(@PathVariable Long patientId){
        return clinicService.getPatientById(patientId);
    }

    @PostMapping(path = "/newPatient")
    public Patient addPatient(@Valid @RequestBody Patient patient){
        return clinicService.addPatient(patient);
    }
    @PutMapping("/updatePatient/{patientId}")
    public Patient updatePatient(@PathVariable Long patientId, @RequestBody Patient patient) {
        return clinicService.updatePatient(patientId,patient);

    }

    @DeleteMapping("/deletePatient/{personalId}")
    public void deletePatient(@PathVariable Long personalId){
        clinicService.deletePatient(personalId);

    }



}
