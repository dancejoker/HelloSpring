package com.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
@Repository
public class BaseRepository<T> {
    public BaseRepository() {
        System.out.println("BaseRepository init !");
    }
}
