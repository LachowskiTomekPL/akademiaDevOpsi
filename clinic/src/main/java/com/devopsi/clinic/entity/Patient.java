package com.devopsi.clinic.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Patient {



    @NotNull
    @Id
//    @Length(min = 11, max = 11)
    private long personalId;
    private LocalDate dayOfBirth;
    private String firstName;
    private String lastName;
    private String address;
//    @Length(min = 9, max = 13)
    private int contactPhoneNumber;


}
