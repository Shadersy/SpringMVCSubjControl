package ru.gvozdilin.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.gvozdilin.springcourse.entity.User;
import ru.gvozdilin.springcourse.mapper.UserMapper;

import java.util.List;

public class UserDaoImpl implements UserDao{


    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {

        String sql = "SELECT * FROM user";

        return jdbcTemplate.query(sql, new UserMapper());
    }

    public void updateBalance(Integer userId, Integer diff) {
        jdbcTemplate.update(
            "UPDATE user SET balance = balance + ? WHERE id = ?",
            diff,
            userId
        );
    }





    public void remittance(Integer userId1, Integer userId2, int value){
        jdbcTemplate.update("UPDATE user SET balance = balance - ? where id = ?", value, userId1);
        jdbcTemplate.update("UPDATE user SET balance = balance + ? where id = ?", value, userId2);
    }

    @Override
    public void addUser(String username) {
        jdbcTemplate.update("INSERT INTO user (name, balance) VALUES (?, 0)", username);
    }

    @Override
    public void deleteUser(Integer id) {
        jdbcTemplate.update("DELETE FROM user WHERE id = ?", id);
    }
}
