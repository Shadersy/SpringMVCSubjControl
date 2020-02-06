package ru.gvozdilin.springcourse.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gvozdilin.springcourse.entity.Merge;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MergeMapper implements RowMapper<Merge> {
    @Override
    public Merge mapRow(ResultSet resultSet4, int i) throws SQLException {
        Merge merge = new Merge();
        merge.setUser_id(resultSet4.getInt("user_id"));
        merge.setPurchase_id(resultSet4.getInt("purchase_id"));
        return merge;
    }
}
