package ru.gvozdilin.springcourse.dao;

import ru.gvozdilin.springcourse.entity.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> findAll();
}
