package com.devopsi.clinic.service;

import com.devopsi.clinic.repository.ClinicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClinicService {

    ClinicRepository clinicRepository;

}
