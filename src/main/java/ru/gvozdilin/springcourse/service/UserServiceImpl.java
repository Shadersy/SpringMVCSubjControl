package ru.gvozdilin.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gvozdilin.springcourse.dao.UserDao;
import ru.gvozdilin.springcourse.entity.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
