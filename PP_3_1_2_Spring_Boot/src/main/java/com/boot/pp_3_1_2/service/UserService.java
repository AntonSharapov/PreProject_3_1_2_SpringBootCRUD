package com.boot.pp_3_1_2.service;

import com.boot.pp_3_1_2.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
