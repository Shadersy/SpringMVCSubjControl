package ru.gvozdilin.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.gvozdilin.springcourse.dao.MergeDao;
import ru.gvozdilin.springcourse.entity.Merge;

import java.util.List;

public class MergeServiceImpl implements MergeService {


    @Autowired
    MergeDao mergeDao;

    @Override
    public List<Merge> findAll() {
        return mergeDao.findAll();
    }
}
