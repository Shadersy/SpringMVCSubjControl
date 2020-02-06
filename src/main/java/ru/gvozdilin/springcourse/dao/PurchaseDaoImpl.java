package ru.gvozdilin.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.gvozdilin.springcourse.entity.Purchase;
import ru.gvozdilin.springcourse.mapper.PurchaseMapper;

import java.util.List;

public class PurchaseDaoImpl implements PurchaseDao{

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public PurchaseDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }




    @Override
    public List<Purchase> findAll() {

        String sql = "SELECT * FROM purchase";
        return jdbcTemplate.query(sql, new PurchaseMapper());
    }
}
