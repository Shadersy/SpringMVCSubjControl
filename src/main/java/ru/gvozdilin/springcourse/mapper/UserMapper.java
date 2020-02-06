package ru.gvozdilin.springcourse.mapper;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import ru.gvozdilin.springcourse.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
       user.setId(resultSet.getInt("id"));
       user.setName(resultSet.getString("name"));
       user.setBalance(resultSet.getInt("balance"));
       return user;
    }
}
