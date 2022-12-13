package com.example.sampleapplicationspringbootmybattis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private String name;
    private Long salary;
    private Integer id;

}
