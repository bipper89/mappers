package com.example.mapeo.dtos;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserResponseDTO {

    private Long id;
    private String name;
    private LocalDate birthday;

}
