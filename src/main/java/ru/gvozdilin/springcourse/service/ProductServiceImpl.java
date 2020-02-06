package ru.gvozdilin.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.gvozdilin.springcourse.dao.ProductDao;
import ru.gvozdilin.springcourse.entity.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> findAll() {


        return productDao.findAll();
    }
}
