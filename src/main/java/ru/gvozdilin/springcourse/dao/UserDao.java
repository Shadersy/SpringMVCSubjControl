package ru.gvozdilin.springcourse.dao;

import ru.gvozdilin.springcourse.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    void updateBalance(Integer userId, Integer diff);
    void remittance(Integer userId1, Integer userId2, int value);
    void addUser(String username);
    void deleteUser(Integer id);
}
