package com.waya.wayaassessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

@Validated
@RestController
@RequestMapping("/wayaapi")
public class Controller {
    @Autowired
    DepositService depositService;

    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@Valid @RequestBody CustomerAccountDetails customerAccountDetails){
        return ResponseEntity.ok(depositService.deposit(customerAccountDetails));
    }

}
