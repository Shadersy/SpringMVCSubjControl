package ru.gvozdilin.springcourse.service;

import ru.gvozdilin.springcourse.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    List<Purchase> findAll();
}
