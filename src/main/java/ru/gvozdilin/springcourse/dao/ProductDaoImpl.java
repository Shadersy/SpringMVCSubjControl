package ru.gvozdilin.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.gvozdilin.springcourse.entity.Product;
import ru.gvozdilin.springcourse.mapper.ProductMapper;

import java.util.List;

public class ProductDaoImpl implements ProductDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
   public ProductDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }


    @Override
    public List<Product> findAll() {
        String sql = "SELECT * FROM product";

        return jdbcTemplate.query(sql, new ProductMapper());
    }
}
