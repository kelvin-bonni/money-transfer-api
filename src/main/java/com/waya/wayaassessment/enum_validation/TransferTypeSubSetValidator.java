package com.waya.wayaassessment.enum_validation;

import com.waya.wayaassessment.TransferType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class TransferTypeSubSetValidator implements ConstraintValidator<TransferTypeSubset, TransferType> {
    private TransferType[] subset;

    @Override
    public void initialize(TransferTypeSubset constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(TransferType value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }
}
