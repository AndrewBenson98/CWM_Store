package com.benson.store;

import com.benson.store.model.User;
import com.benson.store.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StoreApplication.class, args);
//        var orderService = applicationContext.getBean(OrderService.class);
//        orderService.placeOrder();


//        var notificationService = applicationContext.getBean(NotificationService.class);
//        notificationService.send("this is my message");

        var userService = applicationContext.getBean(UserService.class);
        userService.registerNewUser(new User(1,"user1@gmail.com","password1","Andrew"));
//        userService.registerNewUser(new User(1,"user1@gmail.com","password1","Andrew"));
        System.out.println(userService.getUser("user1@gmail.com"));
    }

}
