package com.waya.wayaassessment.enum_validation;

import com.waya.wayaassessment.Currency;
import com.waya.wayaassessment.TransferType;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE, TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = CurrencySubSetValidator.class)
public @interface CurrencySubset {
    Currency[] anyOf();
    String message() default "must be any of {anyOf}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}