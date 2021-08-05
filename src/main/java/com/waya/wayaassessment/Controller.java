package com.waya.wayaassessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/wayaapi")
public class Controller {
    @Autowired
    DepositService depositService;

    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@RequestBody CustomerAccountDetails customerAccountDetails){
        if(TransferType.Deposit.equals(customerAccountDetails.getTransferType()))
            return ResponseEntity.ok(depositService.deposit(customerAccountDetails));
        //any other transfer type is under construction
        return ResponseEntity.accepted().build();
    }

}
