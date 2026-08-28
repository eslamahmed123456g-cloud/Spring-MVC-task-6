package main.com.myApp.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EgyptionNumberValidator implements ConstraintValidator<VaildEgyptionNumber,String> {
    private static final String EGYPTION_PHONE_REGEX ="^(010|011|012|015)(0-9){8}$" ;

    @Override
    public void initialize(VaildEgyptionNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
        if (phone == null || phone.isEmpty())
        return false;
        return phone.matches(EGYPTION_PHONE_REGEX);
    }
}
