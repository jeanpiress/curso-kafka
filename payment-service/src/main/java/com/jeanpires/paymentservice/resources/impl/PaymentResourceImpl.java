package com.jeanpires.paymentservice.resources.impl;

import com.jeanpires.paymentservice.model.Payment;
import com.jeanpires.paymentservice.resources.PaymentResource;
import com.jeanpires.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/payments")
@RequiredArgsConstructor
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentService;


    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
