package com.benson.store.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${email.port}")
    private int port;
    @Value("${email.host}")
    private String host;


    @Override
    public void send(String message, String recipientEmail) {
//        System.out.println("EMAIL");
        System.out.println("Recipient: " + recipientEmail);
        System.out.println("Message: " + message);
        System.out.println(host +":"+port);
//        System.out.println(recipientEmail+" : "+message);
    }
}
