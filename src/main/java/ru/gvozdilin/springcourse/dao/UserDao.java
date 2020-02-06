package ru.gvozdilin.springcourse.dao;

import ru.gvozdilin.springcourse.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
