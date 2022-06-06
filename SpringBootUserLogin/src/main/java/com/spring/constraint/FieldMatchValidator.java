package com.spring.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanUtils;

public abstract class FieldMatchValidator implements ConstraintValidator < FieldMatch, Object > {

    private String firstFieldName;
    private String secondFieldName;

    @Override
    public void initialize(final FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }

    public boolean isValid(final Class<?> value, final ConstraintValidatorContext context) {
        try {
            final Object firstObj = BeanUtils.getPropertyDescriptor(value, firstFieldName);
            final Object secondObj = BeanUtils.getPropertyDescriptor(value, secondFieldName);
            return firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
        } catch (final Exception ignore) {}
        return true;
    }
}