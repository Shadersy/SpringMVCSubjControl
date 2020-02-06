package ru.gvozdilin.springcourse.service;

import ru.gvozdilin.springcourse.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
