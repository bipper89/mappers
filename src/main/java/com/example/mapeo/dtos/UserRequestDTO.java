package com.example.mapeo.dtos;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserRequestDTO {

    private String name;

    private LocalDate birthday;

}
