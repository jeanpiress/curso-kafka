package com.jeanpires.paymentservice.service;

import com.jeanpires.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
