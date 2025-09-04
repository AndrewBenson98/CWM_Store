package com.benson.store;

import com.benson.store.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(StoreApplication.class, args);
//        var user = new User(1L, "John", "abc@gmail.com","password");
        var user = User.builder()
                .name("John")
                .password("password")
                .email("abc@example.com")
                .build();

//        var tag = new Tag("tag1");
//
//        user.addTag("tag1");

//        var profile = Profile.builder()
//                        .bio("Some text")
//                                .build();
//        user.setProfile(profile);
//
//        profile.setUser(user);

        var category = new Category("Category1");
        var product = new Product("product1", new BigDecimal("100"));

        category.getProducts().add(product);
        product.setCategory(category);


//        System.out.println(user);

        System.out.println(category);





    }

}
