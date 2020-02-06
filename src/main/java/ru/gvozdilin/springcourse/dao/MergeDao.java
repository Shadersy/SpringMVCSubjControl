package ru.gvozdilin.springcourse.dao;

import ru.gvozdilin.springcourse.entity.Merge;

import java.util.List;

public interface MergeDao {
    public List<Merge> findAll();
}
