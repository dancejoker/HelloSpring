package com.generic.di;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
public class UserRepository extends BaseRepository<User> {
    public UserRepository() {
        System.out.println("UserRepository is init");
    }
}
