package com.P231.mvc_hibernate.DAO;

import com.P231.mvc_hibernate.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
