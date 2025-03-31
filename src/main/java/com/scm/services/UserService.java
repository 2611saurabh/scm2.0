package com.scm.services;

import java.util.List;
import java.util.Optional;

import com.scm.entities.User;

public interface UserService {

    //logic for save user
    User saveUser(User user);
    Optional<User> getUserById(String id);
    // User getUserById(String id);
    Optional<User> updateUser(User user);
    
    void deleteUser(String id);
    boolean isUserExist(String userId);
    boolean isUserExistByEmail(String email);
    List<User> getAllUser();

}
