package com.benson.store.service;

import org.springframework.beans.factory.annotation.Qualifier;

//@Service
public class OrderService {


    private PaymentService paymentService;

    public OrderService(@Qualifier("stripe") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
