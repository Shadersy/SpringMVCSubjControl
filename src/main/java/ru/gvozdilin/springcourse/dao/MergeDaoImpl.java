package ru.gvozdilin.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.gvozdilin.springcourse.entity.Merge;
import ru.gvozdilin.springcourse.mapper.MergeMapper;

import java.util.List;

public class MergeDaoImpl implements MergeDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public MergeDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Merge> findAll() {
        String sql = "SELECT * FROM merge";

        return jdbcTemplate.query(sql, new MergeMapper());
    }
}
