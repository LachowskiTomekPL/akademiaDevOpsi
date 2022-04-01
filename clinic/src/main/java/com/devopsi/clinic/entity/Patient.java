package com.devopsi.clinic.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor

public class Patient {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;
    @Id
    private Long personalId;
    private String firstName;
    private String lastName;
    private String address;
    private int contactPhoneNumber;


}
