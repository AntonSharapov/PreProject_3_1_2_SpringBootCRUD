package com.boot.pp_3_1_2.DAO;

import com.boot.pp_3_1_2.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
