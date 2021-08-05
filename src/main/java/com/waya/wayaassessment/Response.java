package com.waya.wayaassessment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    String wayaAccountId;
    String customerName;
    String accountNumber;
    BigDecimal amountDeposited;
    String currency;
    TransferType transferType;

}
