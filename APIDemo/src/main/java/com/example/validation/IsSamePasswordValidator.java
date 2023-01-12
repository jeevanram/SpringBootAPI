package com.example.validation;

import com.example.dto.UserDTO;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IsSamePasswordValidator implements ConstraintValidator<IsSamePassword, Object> {

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		UserDTO user = (UserDTO)value;
        return user.getPassword().equals(user.getMatchingPassword());
	}

}
