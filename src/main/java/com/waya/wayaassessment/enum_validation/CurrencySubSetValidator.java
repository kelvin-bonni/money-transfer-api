package com.waya.wayaassessment.enum_validation;

import com.waya.wayaassessment.Currency;
import com.waya.wayaassessment.TransferType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class CurrencySubSetValidator implements ConstraintValidator<CurrencySubset, Currency> {
    private Currency[] subset;

    @Override
    public void initialize(CurrencySubset constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(Currency value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }
}
