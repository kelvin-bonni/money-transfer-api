package com.waya.wayaassessment;

import lombok.Data;
import java.math.BigDecimal;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class CustomerAccountDetails {

    String customerName;
    @NotEmpty
    String accountNumber;
    @NotEmpty
    String currency;
    @NotNull
    BigDecimal amount;
    @NotNull
    TransferType transferType;
}