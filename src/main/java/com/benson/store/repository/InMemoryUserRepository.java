package com.benson.store.repository;

import com.benson.store.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository{

    private Map<String, User> users;


    public InMemoryUserRepository() {
        this.users = new HashMap<>();
    }

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
//        System.out.println(user +" \nhas been saved");
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email,null);
    }

    public Map<String, User> getUsers() {
        return users;
    }
}
