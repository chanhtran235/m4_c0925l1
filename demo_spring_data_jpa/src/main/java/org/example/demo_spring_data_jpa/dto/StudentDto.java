package org.example.demo_spring_data_jpa.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

//    @NotEmpty(message = "Require input data")
//    @Pattern(regexp = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)+$",message = "Not match pattern")
    private String name;
    private boolean gender;
}
