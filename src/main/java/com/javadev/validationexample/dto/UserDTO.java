package com.javadev.validationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private Integer age;
    private String nationality;
}
