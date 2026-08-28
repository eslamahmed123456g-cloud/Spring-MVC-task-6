package main.com.myApp.model;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
@Constraint(validatedBy = EgyptionNumberValidator.class)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface VaildEgyptionNumber {

    String message() default "Invaild Egyption Phone Number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
