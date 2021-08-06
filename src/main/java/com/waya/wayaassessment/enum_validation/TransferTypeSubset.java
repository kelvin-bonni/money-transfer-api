package com.waya.wayaassessment.enum_validation;

import com.waya.wayaassessment.TransferType;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE, TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = TransferTypeSubSetValidator.class)
public @interface TransferTypeSubset {
    TransferType[] anyOf();
    String message() default "must be any of {anyOf}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}