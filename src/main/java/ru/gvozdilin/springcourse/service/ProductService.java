package ru.gvozdilin.springcourse.service;

import ru.gvozdilin.springcourse.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
