package com.benson.store.repository;

import com.benson.store.model.User;

public interface UserRepository {

    public void save(User user);
    public User findByEmail(String email);
}
