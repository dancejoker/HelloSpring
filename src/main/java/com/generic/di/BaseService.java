package com.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
public class BaseService<T> {
    public BaseService() {
        System.out.println("BaseService init ");
    }

    @Autowired
    @Qualifier("baseRepository")
    protected BaseRepository<T> repository;

    public void add(){
        System.out.println("add.....");
        System.out.println(repository);
    }
}
