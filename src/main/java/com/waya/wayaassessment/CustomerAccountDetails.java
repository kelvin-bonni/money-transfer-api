package com.waya.wayaassessment;

import com.waya.wayaassessment.enum_validation.CurrencySubset;
import com.waya.wayaassessment.enum_validation.TransferTypeSubset;
import lombok.Data;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class CustomerAccountDetails {
    @Pattern(regexp = "^(?![0-9]*$)[a-zA-Z0-9]+$", message = "The customer's name must be alphanumeric and not numeric")
    String customerName;
    @NotEmpty(message = "The account number is required")
    String accountNumber;
    @NotNull(message = "The currency is required")
    @CurrencySubset(anyOf = {Currency.GHS})
    Currency currency;
    @Min(value = 1, message = "The amount must be greater than or equal to 1")
    @NotNull(message = "The amount is required")
    BigDecimal amount;
    @NotNull(message = "The transfer type is required")
    @TransferTypeSubset(anyOf = {TransferType.DEPOSIT})
    TransferType transferType;
}