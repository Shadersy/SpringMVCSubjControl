package ru.gvozdilin.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.gvozdilin.springcourse.dao.PurchaseDao;
import ru.gvozdilin.springcourse.entity.Purchase;

import java.util.List;

public class PurchaseServiceImpl implements  PurchaseService {

    @Autowired
    PurchaseDao purchaseDao;

    @Override
    public List<Purchase> findAll() {
        return purchaseDao.findAll();
    }
}
