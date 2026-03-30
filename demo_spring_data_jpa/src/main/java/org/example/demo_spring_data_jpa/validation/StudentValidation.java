package org.example.demo_spring_data_jpa.validation;

import org.example.demo_spring_data_jpa.dto.StudentDto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        StudentDto studentDto =(StudentDto) target;
        if ("".equals(studentDto.getName())){
            errors.rejectValue("name",null,"Require input data");
        }else if (!studentDto.getName().matches("^[A-Z][a-z]*(\\s[A-Z][a-z]+)*$")){
            errors.rejectValue("name",null,"Not match pattern");
        }

    }
}
