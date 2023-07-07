package com.example.mapeo.dtos;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserRequestDTO {

    @Size(min = 4)
    private String name;

    @Past
    private LocalDate birthday;

}
