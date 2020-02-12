package ru.gvozdilin.springcourse.service;

import ru.gvozdilin.springcourse.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    public void updateBalance(Integer userId, Integer diff);
    public void remittance(Integer userId1, Integer userId2, int value);
    public void addUser(String username);
    public void deleteUser(Integer id);
}
