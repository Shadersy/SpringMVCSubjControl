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

    public void updateBalance(Integer userId, Integer diff) {
        userDao.updateBalance(userId, diff);
    }



    public void remittance(Integer userId1, Integer userId2, int value){
         userDao.remittance(userId1, userId2, value);
    }


   public void addUser(String username){
        userDao.addUser(username);
   }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }
}
