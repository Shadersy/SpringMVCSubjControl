package ru.gvozdilin.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
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
}
