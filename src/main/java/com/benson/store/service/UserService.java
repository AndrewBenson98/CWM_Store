package com.benson.store.service;

import com.benson.store.model.User;
import com.benson.store.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;
    private final NotificationService notificationService;


    public UserService(UserRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }


    public void registerNewUser(User user){
        if(repository.findByEmail(user.getEmail()) != null){
            throw new IllegalArgumentException("User already Exists");
        }

        repository.save(user);
        notificationService.send("You have registered successfully!", user.getEmail());
    }

    public User getUser(String email){
        return repository.findByEmail(email);
    }


}
