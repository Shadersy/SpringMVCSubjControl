package ru.gvozdilin.springcourse.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gvozdilin.springcourse.entity.Purchase;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseMapper implements RowMapper<Purchase> {
    @Override
    public Purchase mapRow(ResultSet resultSet3, int i) throws SQLException {
        Purchase purchase = new Purchase();
        purchase.setId(resultSet3.getInt("id"));
        purchase.setDate(resultSet3.getString("date"));
        return purchase;
    }
}
