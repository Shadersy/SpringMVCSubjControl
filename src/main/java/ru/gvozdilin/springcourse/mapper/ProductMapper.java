package ru.gvozdilin.springcourse.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gvozdilin.springcourse.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {



    @Override
    public Product mapRow(ResultSet resultSet2, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet2.getInt("id"));
        product.setProductName(resultSet2.getString("productName"));
        product.setCost(resultSet2.getInt("cost"));
        return product;
    }
}
