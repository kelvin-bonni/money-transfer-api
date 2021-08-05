package com.waya.wayaassessment;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class DepositService {

    public Response deposit(CustomerAccountDetails customerAccountDetails){
        Random rand = new Random();
        BigDecimal percentage = new BigDecimal(76.65/100);

        BigDecimal convertedAmount = percentage.multiply(customerAccountDetails.getAmount()).setScale(2, BigDecimal.ROUND_UP);

        return new Response(String.valueOf(rand.nextInt(1000000000)),customerAccountDetails.getCustomerName(), customerAccountDetails.getAccountNumber(),
                convertedAmount, customerAccountDetails.getCurrency(), customerAccountDetails.getTransferType());
    }
}
