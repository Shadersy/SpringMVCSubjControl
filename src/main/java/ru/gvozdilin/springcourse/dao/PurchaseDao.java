package ru.gvozdilin.springcourse.dao;

import ru.gvozdilin.springcourse.entity.Purchase;

import java.util.List;

public interface PurchaseDao {
    public List<Purchase> findAll();
}
