package com.waya.wayaassessment;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

@Service
public class DepositService {

    public Response deposit(CustomerAccountDetails customerAccountDetails){
        BigDecimal percentage = BigDecimal.valueOf(76.65 / 100);

        BigDecimal convertedAmount = percentage.multiply(customerAccountDetails.getAmount()).setScale(2, RoundingMode.HALF_UP);

        return new Response(String.valueOf(System.currentTimeMillis()),customerAccountDetails.getCustomerName(), customerAccountDetails.getAccountNumber(),
                convertedAmount, customerAccountDetails.getCurrency(), customerAccountDetails.getTransferType());
    }
}
