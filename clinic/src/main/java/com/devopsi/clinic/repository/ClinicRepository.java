package com.devopsi.clinic.repository;

import com.devopsi.clinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Patient, Long> {
}
